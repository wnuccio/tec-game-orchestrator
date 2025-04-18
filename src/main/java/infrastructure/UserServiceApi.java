package infrastructure;

import domain.user.UserService;

public class UserServiceApi implements UserService {
    @Override
    public boolean existsUser(int userId) {
        throw new UnsupportedOperationException("Not implemented");
    }
}
