package domain;

public class User {
    private final String id;
    private final String subscriptionWebsite;

    public User(String id, String subscriptionWebsite) {
        this.id = id;
        this.subscriptionWebsite = subscriptionWebsite;
    }

    public String getId() {
        return id;
    }

    public String getSubscriptionWebsite() {
        return subscriptionWebsite;
    }
}