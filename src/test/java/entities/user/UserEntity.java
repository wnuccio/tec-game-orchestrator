package entities.user;

import collections.TestContext;
import domain.UserId;
import domain.user.User;

public class UserEntity {
    private final TestContext context;

    private UserId id;

    public UserEntity(TestContext context) {
        this.context = context;
    }

    public UserEntity withUserId(int id) {
        this.id = new UserId(id);
        return this;
    }

    public UserResult get() {
        User user = new User(id, "Andrea", "Delfi", "andrea.delfi@email.com");
        context.userCollection().addUser(user);
        return new UserResult(user);
    }
}
