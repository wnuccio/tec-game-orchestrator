package collections;

import domain.subscription.Subscription;
import domain.subscription.SubscriptionService;
import domain.user.UserId;

import java.util.ArrayList;
import java.util.List;

public class SubscriptionCollection implements SubscriptionService {
    private final List<Subscription> subscriptions = new ArrayList<>();

    @Override
    public void subscribe(Subscription subscription) {
        subscriptions.add(subscription);
    }

    @Override
    public Subscription findSubscription(UserId userId) {
        return subscriptions.stream()
                .filter(subscription -> subscription.userId().equals(userId))
                .findFirst()
                .orElseThrow();
    }
}