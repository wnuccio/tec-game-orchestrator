package entities.subscription;

import domain.user.UserId;
import domain.session.Website;
import domain.subscription.Subscription;

public class SubscriptionResult {

    private final Subscription subscription;

    public SubscriptionResult(Subscription subscription) {
        this.subscription = subscription;
    }

    public UserId userId() {
        return subscription.userId();
    }

    public Website website() {
        return subscription.website();
    }
}