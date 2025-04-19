package entities.subscription;

import domain.UserId;
import domain.subscription.Subscription;

public class SubscriptionResult {

    private final Subscription subscription;

    public SubscriptionResult(Subscription subscription) {
        this.subscription = subscription;
    }

    public UserId userId() {
        return subscription.userId();
    }
}