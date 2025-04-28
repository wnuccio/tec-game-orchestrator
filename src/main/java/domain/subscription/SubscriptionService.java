package domain.subscription;

import domain.user.UserId;

public interface SubscriptionService {
    void subscribe(Subscription subscription);

    Subscription findSubscription(UserId userId);
}