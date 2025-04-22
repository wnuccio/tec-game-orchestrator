package tests;

import collections.TestContext;
import entities.question.QuestionResult;
import entities.startedgame.StartedGameResult;
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
        QuestionResult questionResult = context.question().withQuestions("Xxxx ?", "Yyyy ?", "Zzzz ?").get();
        StartedGameResult game = context.startedGame().fromQuestions(questionResult).startGame();

        context.verifyThat(game).hasQuestions("Xxxx ?", "Yyyy ?", "Zzzz ?");
    }


        @Test
    void start_game_sends_a_welcome_email() {
        UserResult user = context.user().withEmail("gamer@email.com").get();

        StartedGameResult game = context.startedGame().fromUser(user).startGame();

        context.verifyThat(game).isEmailSent("gamer@email.com");
    }
}
