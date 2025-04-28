package tests;

import collections.TestContext;
import domain.session.Website;
import entities.question.QuestionResult;
import entities.session.SessionResult;
import entities.startedgame.StartedGameResult;
import entities.subscription.SubscriptionResult;
import entities.user.UserResult;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class StartGameTest {

    private TestContext context;

    @BeforeEach
    void setUp() {
        context = new TestContext();
    }


    @Test
    void start_game_replies_with_questions() {
        QuestionResult questions = context.questions()
                .addQuestion("Question 1?", "Answer 1")
                .addQuestion("Question 2?", "Answer 2")
                .addQuestion("Question 3?", "Answer 3")
                .get();

        StartedGameResult game = context.startedGame().fromQuestions(questions).get();

        context.verifyThat(game).hasQuestions("Question 1?", "Question 2?", "Question 3?");
    }

    @Test
    void start_game_sends_a_welcome_email_based_on_subscribtion_website() {
        UserResult user = context.user().withEmail("user.from.france@email.com").get();
        SessionResult session = context.session().withWebsite(Website.FRANCE).get();
        SubscriptionResult subscription = context.subscription().fromUser(user).fromSession(session).get();

        StartedGameResult game = context.startedGame()
                .fromSubscription(subscription)
                .get();

        context.verifyThat(game).isEmailSent("user.from.france@email.com", Website.FRANCE);
    }
}
