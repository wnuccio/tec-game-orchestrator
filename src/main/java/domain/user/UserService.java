package domain.user;

import domain.UserId;

public interface UserService {
    boolean existsUser(UserId userId);
}