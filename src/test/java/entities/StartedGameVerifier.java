package entities;

import collections.TestContext;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StartedGameVerifier {
    private final TestContext context;
    private final StartedGameResult startedGame;

    public StartedGameVerifier(TestContext context, StartedGameResult startedGame) {
        this.context = context;
        this.startedGame = startedGame;
    }

    public void isEmailSent(String email) {
        assertEquals(context.mailCollection().lastEmailSent().emailAddress(), email);
    }
}
