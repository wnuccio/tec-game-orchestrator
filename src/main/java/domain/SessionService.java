package domain;

public interface SessionService {
    Session deserialize(SessionToken sessionToken);
}
