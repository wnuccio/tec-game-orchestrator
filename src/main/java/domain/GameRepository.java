package domain;

public interface GameRepository {
    void save(Game game);
    Game findByUserId(String userId);
}
