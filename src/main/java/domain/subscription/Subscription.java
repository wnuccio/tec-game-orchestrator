package domain.subscription;

import domain.UserId;
import domain.session.Website;

public class Subscription {
    private UserId userId;
    private Website website;

    public Subscription(UserId userId, Website website) {
        this.userId = userId;
        this.website = website;
    }

    public UserId userId() {
        return userId;
    }
}
