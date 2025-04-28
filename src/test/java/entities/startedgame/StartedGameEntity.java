package entities.startedgame;

import collections.TestContext;
import domain.game.Question;
import entities.question.QuestionResult;
import entities.subscription.SubscriptionResult;
import entities.user.UserResult;

import java.util.List;

public class StartedGameEntity {
    private final TestContext context;
    private SubscriptionResult subscription;
    private QuestionResult questions;

    public StartedGameEntity(TestContext context) {
        this.context = context;
    }

    public StartedGameEntity fromUser(UserResult user) {
        this.subscription = context.subscription().fromUser(user).get();
        return this;
    }

    public StartedGameEntity fromSubscription(SubscriptionResult subscription) {
        this.subscription = subscription;
        return this;
    }

    public StartedGameEntity fromQuestions(QuestionResult questions) {
        this.questions = questions;
        return this;
    }

    public StartedGameResult get() {
        subscription = subscription != null ? subscription : context.subscription().get();
        questions = questions != null ? questions : context.questions().get();
        List<Question> questions = context.startGameUseCase().startGame(subscription.userId());
        return new StartedGameResult(subscription, questions);
    }
}
