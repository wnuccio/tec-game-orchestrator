package entities.session;

import collections.TestContext;
import domain.session.Session;
import domain.session.SessionToken;
import domain.time.Time;
import domain.session.Website;

public class SessionEntity {
    private final TestContext context;
    private Website website;

    public SessionEntity(TestContext testContext) {
        this.context = testContext;
    }

    public SessionEntity withWebsite(Website website) {
        this.website = website;
        return this;
    }

    public SessionResult get() {
        website = website != null ? website : Website.ITALY;
        Session session = new Session(Time.now(), website);
        SessionToken token = context.sessionCollection().serialize(session);
        return new SessionResult(token);
    }
}
