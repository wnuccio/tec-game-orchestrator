package entities.startedgame;

import collections.TestContext;
import domain.game.Question;

import java.util.List;
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

    public void hasQuestions(String... questions) {
        List<Question> returnedQuestions = startedGame.questions();

        assertEquals(questions.length, returnedQuestions.size());

        Stream.of(questions)
            .map(Question::new)
            .forEach(q -> assertTrue(returnedQuestions.contains(q)));
    }
}
