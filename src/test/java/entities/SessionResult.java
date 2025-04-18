package entities;

import domain.Session;
import domain.SessionToken;

public class SessionResult {
    private SessionToken token;

    public SessionResult(SessionToken token) {
        this.token = token;
    }

    public SessionToken token() {
        return token;
    }
}
