package entities.session;

import domain.session.SessionToken;

public class SessionResult {
    private SessionToken token;

    public SessionResult(SessionToken token) {
        this.token = token;
    }

    public SessionToken token() {
        return token;
    }
}
