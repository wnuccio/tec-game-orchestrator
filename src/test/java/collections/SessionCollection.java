package collections;

import domain.session.Session;
import domain.session.SessionService;
import domain.session.SessionToken;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class SessionCollection implements SessionService {
    private final Map<SessionToken, Session> sessions = new HashMap<>();

    @Override
    public Session deserialize(SessionToken sessionToken) {
        return Optional.ofNullable(sessions.get(sessionToken)).orElseThrow();
    }

    public SessionToken serialize(Session session) {
        SessionToken token = new SessionToken("" + session.startedAt());
        sessions.put(token, session);
        return token;
    }
}
