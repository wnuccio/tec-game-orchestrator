package collections;

import usecases.SubscribeUserUseCase;

public class TestContext {
    private SubscriptionCollection subscriptionServiceCollection;

    SubscriptionCollection getSubscriptionServiceCollection() {
        if (subscriptionServiceCollection == null) {
            subscriptionServiceCollection = new SubscriptionCollection();
        }
        return subscriptionServiceCollection;
    }

    public SubscribeUserUseCase getSubscribeUserUseCase() {
        return new SubscribeUserUseCase(getSubscriptionServiceCollection());
    }
}