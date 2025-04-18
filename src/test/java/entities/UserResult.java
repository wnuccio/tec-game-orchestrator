package entities;

import domain.User;

public class UserResult {
    private final User user;

    public UserResult(User user) {
        this.user = user;
    }

    public int userId() {
        return user.id();
    }
}
