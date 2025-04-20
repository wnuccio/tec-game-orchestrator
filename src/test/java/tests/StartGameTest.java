package tests;

import collections.TestContext;
import entities.StartedGameResult;
import entities.user.UserResult;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class StartGameTest {

    private TestContext context;

    @BeforeEach
    void setUp() {
        context = new TestContext();
    }

    @Test
    void start_game_sends_a_welcome_email() {
        UserResult user = context.user().withEmail("gamer@email.com").get();

        StartedGameResult game = context.startedGame().fromUser(user).startGame();

        context.verifyThat(game).isEmailSent("gamer@email.com");
    }
}
