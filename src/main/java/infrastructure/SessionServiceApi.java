package infrastructure;

import domain.session.Session;
import domain.session.SessionService;
import domain.session.SessionToken;

public class SessionServiceApi implements SessionService {
    @Override
    public Session deserialize(SessionToken sessionToken) {
        throw new UnsupportedOperationException("Not implemented yet");
    }
}
