package tests;

import collections.TestContext;
import domain.game.Question;
import entities.answer.GameEndResult;
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
    void game_is_won_with_1_correct_answer_out_of_1() {
        QuestionResult questionResult = context.questions()
                .addQuestion("What's your name?", "John")
                .get();

        StartedGameResult startedGame = context.startedGame().fromQuestions(questionResult).get();

        List<Question> questions = startedGame.questions();

        GameEndResult gameEnd = context.answers()
                .addAnswer(questions.get(0).id(), "John")
                .get();

        context.verifyThat(gameEnd).isGameWon();
    }

    @Test
    void game_is_lost_with_1_wrong_answer_out_of_1() {
        QuestionResult questionResult = context.questions()
                .addQuestion("What's your name?", "John")
                .get();

        StartedGameResult startedGame = context.startedGame().fromQuestions(questionResult).get();

        List<Question> questions = startedGame.questions();

        GameEndResult gameEnd = context.answers()
                .addAnswer(questions.get(0).id(), "Mary")
                .get();

        context.verifyThat(gameEnd).isGameLost();
    }

    @Test
    void when_game_is_won_a_voucher_is_returned() {
        GameEndResult gameEnd = context.answers().get();

        context.verifyThat(gameEnd).hasVoucher();
    }
}
