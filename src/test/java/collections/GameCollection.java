package collections;

import domain.UserId;
import domain.game.Game;
import domain.game.GameRepository;

import java.util.HashMap;
import java.util.Map;

public class GameCollection implements GameRepository {
    private final Map<UserId, Game> games = new HashMap<>();

    @Override
    public void save(Game game) {
        games.put(game.getUserId(), game);
    }

    @Override
    public Game findByUserId(String userId) {
        return games.get(userId);
    }
}
