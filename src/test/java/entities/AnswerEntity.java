package entities;

import collections.TestContext;
import domain.game.QuestionId;
import entities.user.UserResult;
import usecases.GameEnd;

import java.util.HashMap;
import java.util.Map;

public class AnswerEntity {
    private final TestContext context;
    private final Map<QuestionId, String> answers;
    private UserResult user;

    public AnswerEntity(TestContext context) {
        this.context = context;
        answers = new HashMap<>();
    }

    public AnswerEntity addAnswer(QuestionId id, String answer) {
        answers.put(id, answer);
        return this;
    }

    public AnswerResult get() {
        user = context.user().get();
        Map.Entry<QuestionId, String> firstAnswer = answers.entrySet().iterator().next();
        GameEnd gameEnd = context.giveAnswerUseCase().giveAnswer(user.userId(), firstAnswer.getKey(), firstAnswer.getValue());
        return new AnswerResult(context, gameEnd);
    }
}
