package collections;

import domain.SubscriptionService;

import java.util.HashMap;
import java.util.Map;

public class SubscriptionCollection implements SubscriptionService {
    private final Map<String, String> subscriptions = new HashMap<>();

    @Override
    public void subscribe(String userId, String website) {
        subscriptions.put(userId, website);
    }

    public String getSubscription(String userId) {
        return subscriptions.get(userId);
    }
}