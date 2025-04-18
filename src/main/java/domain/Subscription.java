package domain;

public class Subscription {
    private int userId;
    private Website website;

    public Subscription(int userId, Website website) {
        this.userId = userId;
        this.website = website;
    }
}
