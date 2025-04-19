package collections;

import domain.UserId;
import domain.user.User;
import domain.user.UserService;

import java.util.HashMap;
import java.util.Map;

public class UserCollection implements UserService {
    private final Map<UserId, User> users = new HashMap<>();

    @Override
    public boolean existsUser(UserId userId) {
        return users.containsKey(userId);
    }

    public void addUser(User user) {
        users.put(user.id(), user);
    }
}