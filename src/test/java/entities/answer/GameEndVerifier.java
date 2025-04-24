package entities.answer;

import collections.TestContext;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class GameEndVerifier {
    private final TestContext context;
    private final GameEndResult gameEnd;

    public GameEndVerifier(TestContext context, GameEndResult gameEnd) {
        this.context = context;
        this.gameEnd = gameEnd;
    }

    public void isGameWon() {
        assertTrue(gameEnd.gameEnd().isWon());
    }

    public void isGameLost() {
        assertFalse(gameEnd.gameEnd().isWon());
    }

    public void hasVoucher() {
        assertTrue(gameEnd.voucher().isPresent());
    }
}
