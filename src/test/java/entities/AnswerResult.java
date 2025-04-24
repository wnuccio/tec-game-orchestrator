package entities;

import collections.TestContext;
import domain.game.GameEnd;

public class AnswerResult {
    private final TestContext context;
    private final GameEnd gameEnd;

    public AnswerResult(TestContext context, GameEnd gameEnd) {
        this.context = context;
        this.gameEnd = gameEnd;
    }

    public GameEnd gameEnd() {
        return gameEnd;
    }
}
