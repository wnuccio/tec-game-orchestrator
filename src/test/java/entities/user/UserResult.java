package entities.user;

import domain.user.UserId;
import domain.user.User;

public class UserResult {
    private final User user;

    public UserResult(User user) {
        this.user = user;
    }

    public UserId userId() {
        return user.id();
    }
}
