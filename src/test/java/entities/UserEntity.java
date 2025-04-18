package entities;

import collections.TestContext;
import domain.User;

public class UserEntity {
    private final TestContext context;

    private int id;

    public UserEntity(TestContext context) {
        this.context = context;
    }

    public UserEntity withUserId(int id) {
        this.id = id;
        return this;
    }

    public UserResult get() {
        User user = new User(id, "Andrea", "Delfi", "andrea.delfi@email.com");
        context.userCollection().addUser(user);
        return new UserResult(user);
    }
}
