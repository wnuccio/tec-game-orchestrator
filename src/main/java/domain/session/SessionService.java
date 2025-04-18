package domain.session;

public interface SessionService {
    Session deserialize(SessionToken sessionToken);
}
