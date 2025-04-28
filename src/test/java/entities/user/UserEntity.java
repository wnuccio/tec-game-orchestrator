package entities.user;

import collections.TestContext;
import domain.user.User;
import domain.user.UserId;

public class UserEntity {
    private final TestContext context;

    private UserId id;
    private String email;

    public UserEntity(TestContext context) {
        this.context = context;
    }

    public UserEntity withUserId(int id) {
        this.id = new UserId(id);
        return this;
    }

    public UserResult get() {
        email = email != null ? email : "andrea.delfi@email.com";
        id = id != null ? id : context.userCollection().nextId();
        User user = new User(id, "Andrea", "Delfi", email);
        context.userCollection().addUser(user);
        return new UserResult(user);
    }

    public UserEntity withEmail(String email) {
        this.email = email;
        return this;
    }
}
