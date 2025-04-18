package infrastructure;

import domain.UserService;

public class UserServiceApi implements UserService {
    @Override
    public void getUser(String userId) {
        throw new UnsupportedOperationException("Not implemented");
    }
}
