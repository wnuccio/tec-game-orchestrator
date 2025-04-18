package collections;

import entities.SubscribedUserEntity;
import usecases.SubscribeUserUseCase;

public class TestContext {
    private SubscriptionCollection subscriptionServiceCollection;
    private SubscribedUserEntity subscribedUserEntity;

    SubscriptionCollection getSubscriptionCollection() {
        if (subscriptionServiceCollection == null) {
            subscriptionServiceCollection = new SubscriptionCollection();
        }
        return subscriptionServiceCollection;
    }

    public SubscribeUserUseCase getSubscribeUserUseCase() {
        return new SubscribeUserUseCase(getSubscriptionCollection());
    }

    public SubscribedUserEntity subscribedUserEntity() {
        if (subscribedUserEntity == null) {
            subscribedUserEntity = new SubscribedUserEntity(this);
        }
        return subscribedUserEntity;
    }
}