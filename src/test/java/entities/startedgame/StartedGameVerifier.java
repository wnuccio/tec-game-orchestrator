package entities.startedgame;

import collections.TestContext;
import domain.game.Question;
import domain.session.Website;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

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

    public void isEmailSent(String email, Website website) {
        fail();
    }

    public void hasQuestions(String... questions) {
        List<String> returnedQuestions = startedGame.questions().stream().map(Question::question).collect(Collectors.toList());

        assertEquals(questions.length, returnedQuestions.size());

        Stream.of(questions)
            .forEach(question -> assertTrue(returnedQuestions.contains(question)));
    }
}
