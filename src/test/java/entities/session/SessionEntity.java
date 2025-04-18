package entities.session;

import collections.TestContext;
import domain.session.Session;
import domain.session.SessionToken;
import domain.time.Time;
import domain.session.Website;

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
