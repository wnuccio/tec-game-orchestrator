package entities;

import collections.TestContext;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AnswerVerifier {
    private final TestContext context;
    private final AnswerResult answerResult;

    public AnswerVerifier(TestContext context, AnswerResult answerResult) {
        this.context = context;
        this.answerResult = answerResult;
    }

    public void isGameWon() {
        assertTrue(answerResult.gameEnd().isWon());
    }

    public void isGameLost() {
        assertFalse(answerResult.gameEnd().isWon());
    }
}
