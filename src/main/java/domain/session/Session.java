package domain.session;

import domain.time.Time;

public class Session {
    private Time startedAt;
    private Website website;

    public Session(Time startedAt, Website website) {
        this.website = website;
        this.startedAt = startedAt;
    }

    public Website website() {
        return website;
    }

    public Time startedAt() {
        return startedAt;
    }
}
