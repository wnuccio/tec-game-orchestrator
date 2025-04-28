package collections;

import domain.user.User;
import domain.user.UserId;
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

    @Override
    public String findUserEmail(UserId userId) {
        return users.get(userId).emailAddress();
    }

    public UserId nextId() {
        return users.values()
                .stream()
                .map(User::id)
                .map(UserId::id)
                .max(Integer::compareTo)
                .map(id -> new UserId(id + 1))
                .orElse(new UserId(1));
    }
}