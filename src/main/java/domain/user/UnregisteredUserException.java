package domain.user;

import domain.UserId;

public class UnregisteredUserException extends RuntimeException {
    public UnregisteredUserException(UserId userId) {
        super("User with ID " + userId + " is not registered.");
    }
}
