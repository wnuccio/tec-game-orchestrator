package usecases;

import domain.SubscriptionService;

public class SubscribeUserUseCase {
    private final SubscriptionService subscriptionService;

    public SubscribeUserUseCase(SubscriptionService subscriptionService) {
        this.subscriptionService = subscriptionService;
    }

    public void subscribeUser(String userId, String website) {
        subscriptionService.subscribe(userId, website);
    }
}
