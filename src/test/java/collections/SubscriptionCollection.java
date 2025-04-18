package collections;

import domain.subscription.Subscription;
import domain.subscription.SubscriptionService;

import java.util.ArrayList;
import java.util.List;

public class SubscriptionCollection implements SubscriptionService {
    private final List<Subscription> subscriptions = new ArrayList<>();

    @Override
    public void subscribe(Subscription subscription) {
        subscriptions.add(subscription);
    }
}