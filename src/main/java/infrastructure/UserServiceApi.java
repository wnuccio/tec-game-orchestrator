package infrastructure;

import domain.UserId;
import domain.user.UserService;

public class UserServiceApi implements UserService {
    @Override
    public boolean existsUser(UserId userId) {
        throw new UnsupportedOperationException("Not implemented");
    }

    @Override
    public String findUserEmail(UserId userId) {
        throw new UnsupportedOperationException("Not implemented");
    }
}
