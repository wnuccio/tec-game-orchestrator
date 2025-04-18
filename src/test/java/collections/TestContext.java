package collections;

import entities.session.SessionEntity;
import entities.subscription.SubscriptionEntity;
import entities.user.UserEntity;
import usecases.SubscribeUserUseCase;

public class TestContext {
    private SessionCollection sessionCollection;
    private SubscriptionCollection subscriptionCollection;
    private UserCollection userCollection;

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
    SubscriptionCollection subscriptionCollection() {
        if (subscriptionCollection == null) {
            subscriptionCollection = new SubscriptionCollection();
        }
        return subscriptionCollection;
    }

    public SubscribeUserUseCase subscribeUserUseCase() {
        return new SubscribeUserUseCase(userCollection(), sessionCollection(), subscriptionCollection());
    }
    public UserEntity user() {
        return new UserEntity(this);
    }
    public SessionEntity session() {
        return new SessionEntity(this);
    }

    public SubscriptionEntity subscription() {
        return new SubscriptionEntity(this);
    }
}