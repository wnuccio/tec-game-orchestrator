package entities.answer;

import collections.TestContext;
import domain.game.GameEnd;

public class GameEndResult {
    private final TestContext context;
    private final GameEnd gameEnd;

    public GameEndResult(TestContext context, GameEnd gameEnd) {
        this.context = context;
        this.gameEnd = gameEnd;
    }

    public GameEnd gameEnd() {
        return gameEnd;
    }
}
