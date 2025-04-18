package collections;

import domain.User;
import domain.UserService;

import java.util.HashMap;
import java.util.Map;

public class UserCollection implements UserService {
    private final Map<Integer, User> users = new HashMap<>();

    @Override
    public boolean existsUser(int userId) {
        return users.containsKey(userId);
    }

    public void addUser(User user) {
        users.put(user.id(), user);
    }
}