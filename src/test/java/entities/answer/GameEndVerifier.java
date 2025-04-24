package entities.answer;

import collections.TestContext;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class GameEndVerifier {
    private final TestContext context;
    private final GameEndResult gameEndResult;

    public GameEndVerifier(TestContext context, GameEndResult gameEndResult) {
        this.context = context;
        this.gameEndResult = gameEndResult;
    }

    public void isGameWon() {
        assertTrue(gameEndResult.gameEnd().isWon());
    }

    public void isGameLost() {
        assertFalse(gameEndResult.gameEnd().isWon());
    }
}
