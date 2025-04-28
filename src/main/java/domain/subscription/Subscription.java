package domain.subscription;

import domain.session.Website;
import domain.user.UserId;

import java.util.Objects;

public class Subscription {
    private final UserId userId;
    private final Website website;

    public Subscription(UserId userId, Website website) {
        this.userId = Objects.requireNonNull(userId);
        this.website = Objects.requireNonNull(website);
    }

    public UserId userId() {
        return userId;
    }

    public Website website() {
        return website;
    }
}
