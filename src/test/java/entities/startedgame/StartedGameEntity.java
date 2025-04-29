package entities.startedgame;

import collections.TestContext;
import domain.game.GameReport;
import entities.question.QuestionResult;
import entities.session.SessionResult;
import entities.subscription.SubscriptionResult;

public class StartedGameEntity {
    private final TestContext context;
    private SubscriptionResult subscription;
    private QuestionResult questions;
    private SessionResult gameSession;

    public StartedGameEntity(TestContext context) {
        this.context = context;
    }

    public StartedGameEntity fromSubscription(SubscriptionResult subscription) {
        this.subscription = subscription;
        return this;
    }

    public StartedGameEntity fromQuestions(QuestionResult questions) {
        this.questions = questions;
        return this;
    }

    public StartedGameEntity withGameSession(SessionResult gameSession) {
        this.gameSession = gameSession;
        return this;
    }

    public StartedGameResult get() {
        subscription = subscription != null ? subscription : context.subscription().get();
        questions = questions != null ? questions : context.questions().get();
        gameSession = gameSession != null ? gameSession : context.session().withWebsite(subscription.website()).get();
        GameReport gameReport = context.startGameUseCase().startGame(subscription.userId(), gameSession.token());
        return new StartedGameResult(subscription, gameReport);
    }
}
