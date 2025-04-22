package domain.subscription;

import domain.user.UserId;
import domain.session.Website;

public class Subscription {
    private final UserId userId;
    private final Website website;

    public Subscription(UserId userId, Website website) {
        this.userId = userId;
        this.website = website;
    }

    public UserId userId() {
        return userId;
    }

    public Website website() {
        return website;
    }
}
