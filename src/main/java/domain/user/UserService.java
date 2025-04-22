package domain.user;

public interface UserService {
    boolean existsUser(UserId userId);

    String findUserEmail(UserId userId);
}