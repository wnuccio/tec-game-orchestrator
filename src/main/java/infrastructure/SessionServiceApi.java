package infrastructure;

import domain.Session;
import domain.SessionService;
import domain.SessionToken;

public class SessionServiceApi implements SessionService {
    @Override
    public Session deserialize(SessionToken sessionToken) {
        throw new UnsupportedOperationException("Not implemented yet");
    }
}
