package tests;

import collections.TestContext;
import domain.game.Question;
import entities.AnswerResult;
import entities.question.QuestionResult;
import entities.startedgame.StartedGameResult;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

public class GiveAnswersTest {

    private TestContext context;

    @BeforeEach
    void setUp() {
        context = new TestContext();
    }

    @Test
    void game_is_won_with_1_correct_answers_out_of_1() {
        QuestionResult questionResult = context.questions()
                .addQuestion("What's your name?", "John")
                .get();

        StartedGameResult gameResult = context.startedGame().fromQuestions(questionResult).get();

        List<Question> questions = gameResult.questions();

        AnswerResult answersGivenResult = context.answers()
                .addAnswer(questions.get(0).id(), "John")
                .get();

        context.verifyThat(answersGivenResult).isGameWon();
    }
}
