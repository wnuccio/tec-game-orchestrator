package infrastructure;

import domain.game.Game;
import domain.game.GameRepository;

public class PostgresGameRepository implements GameRepository {
    @Override
    public void save(Game game) {
        throw new UnsupportedOperationException("Not implemented");
    }

    @Override
    public Game findByUserId(String userId) {
        throw new UnsupportedOperationException("Not implemented");
    }
}
