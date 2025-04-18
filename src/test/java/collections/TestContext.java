package collections;

import entities.SubscribedUserEntity;
import usecases.SubscribeUserUseCase;

public class TestContext {
    private SubscriptionCollection subscriptionCollection;

    SubscriptionCollection getSubscriptionCollection() {
        if (subscriptionCollection == null) {
            subscriptionCollection = new SubscriptionCollection();
        }
        return subscriptionCollection;
    }

    public SubscribeUserUseCase getSubscribeUserUseCase() {
        return new SubscribeUserUseCase(getSubscriptionCollection());
    }

    public SubscribedUserEntity subscribedUserEntity() {
        return new SubscribedUserEntity(this);
    }
}