package collections;

import domain.game.GameRepository;
import entities.answer.AnswerEntity;
import entities.answer.GameEndResult;
import entities.answer.GameEndVerifier;
import entities.question.QuestionEntity;
import entities.session.SessionEntity;
import entities.startedgame.StartedGameEntity;
import entities.startedgame.StartedGameResult;
import entities.startedgame.StartedGameVerifier;
import entities.subscription.SubscriptionEntity;
import entities.user.UserEntity;
import usecases.GiveAnswerUseCase;
import usecases.StartGameUseCase;
import usecases.SubscribeUserUseCase;

public class TestContext {
    private SessionCollection sessionCollection;
    private SubscriptionCollection subscriptionCollection;
    private UserCollection userCollection;
    private MailCollection mailCollection;
    private QuestionCollection questionCollection;

    public UserCollection userCollection() {
        if (userCollection == null) {
            userCollection = new UserCollection();
        }
        return userCollection;
    }
    public SessionCollection sessionCollection() {
        if (sessionCollection == null) {
            sessionCollection = new SessionCollection();
        }
        return sessionCollection;
    }
    public SubscriptionCollection subscriptionCollection() {
        if (subscriptionCollection == null) {
            subscriptionCollection = new SubscriptionCollection();
        }
        return subscriptionCollection;
    }
    public MailCollection mailCollection() {
        if (mailCollection == null) {
            mailCollection = new MailCollection();
        }
        return mailCollection;
    }
    public QuestionCollection questionCollection() {
        if (questionCollection == null) {
            questionCollection = new QuestionCollection();
        }
        return questionCollection;
    }
    public SubscribeUserUseCase subscribeUserUseCase() {
        return new SubscribeUserUseCase(userCollection(), sessionCollection(), subscriptionCollection());
    }
    public StartGameUseCase startGameUseCase() {
        return new StartGameUseCase(
                userCollection(),
                sessionCollection(),
                subscriptionCollection(),
                questionCollection(),
                gameCollection(),
                mailCollection());
    }
    public GiveAnswerUseCase giveAnswerUseCase() {
        return new GiveAnswerUseCase(questionCollection, gameCollection());
    }

    // Repositories

    private GameRepository gameCollection() {
        return new GameCollection();
    }
    // Entities
    public UserEntity user() {
        return new UserEntity(this);
    }
    public SessionEntity session() {
        return new SessionEntity(this);
    }
    public SubscriptionEntity subscription() {
        return new SubscriptionEntity(this);
    }
    public StartedGameEntity startedGame() {
        return new StartedGameEntity(this);
    }
    public QuestionEntity questions() {
        return new QuestionEntity(this);
    }

    public AnswerEntity answers() {
        return new AnswerEntity(this);
    }
    // Verifiers
    public StartedGameVerifier verifyThat(StartedGameResult startedGameResult) {
        return new StartedGameVerifier(this, startedGameResult);
    }

    public GameEndVerifier verifyThat(GameEndResult gameEndResult) {
        return new GameEndVerifier(this, gameEndResult);
    }
}