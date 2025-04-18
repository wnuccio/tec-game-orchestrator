package domain;

public class UnregisteredUserException extends RuntimeException {
    public UnregisteredUserException(int userId) {
        super("User with ID " + userId + " is not registered.");
    }
}
