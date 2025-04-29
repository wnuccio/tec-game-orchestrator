package entities.startedgame;

import collections.TestContext;
import domain.game.Question;
import domain.session.Website;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class StartedGameVerifier {
    private final TestContext context;
    private final StartedGameResult startedGame;

    public StartedGameVerifier(TestContext context, StartedGameResult startedGame) {
        this.context = context;
        this.startedGame = startedGame;
    }

    public void isEmailSent(String emailAddress, Website website) {
        assertEquals(context.mailCollection().lastEmailSent().emailAddress(), emailAddress);
        assertEquals(context.mailCollection().lastEmailSent().website(), website);
    }

    public void hasQuestions(String... questions) {
        List<String> returnedQuestions = startedGame.questions().stream().map(Question::question).collect(Collectors.toList());

        assertEquals(questions.length, returnedQuestions.size());

        Stream.of(questions)
            .forEach(question -> assertTrue(returnedQuestions.contains(question)));
    }

    public void isStartingFailed() {
        assertFalse(startedGame.isStarted());
    }
}
