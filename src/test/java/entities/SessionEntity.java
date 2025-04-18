package entities;

import collections.TestContext;
import domain.Session;
import domain.SessionToken;
import domain.Time;
import domain.Website;

public class SessionEntity {
    private final TestContext context;

    public SessionEntity(TestContext testContext) {
        this.context = testContext;
    }

    public SessionResult get() {
        Session session = new Session(Time.now(), Website.ITALY);
        SessionToken token = context.sessionCollection().serialize(session);
        return new SessionResult(token);
    }
}
