package entities.endedgame;

import collections.TestContext;
import domain.game.GameEnd;
import domain.game.Question;
import domain.game.QuestionId;
import entities.startedgame.StartedGameResult;
import entities.user.UserResult;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EndedGameEntity {
    private final TestContext context;
    private final Map<QuestionId, String> answers;
    private UserResult user;
    private StartedGameResult startedGame;

    public EndedGameEntity(TestContext context) {
        this.context = context;
        answers = new HashMap<>();
    }

    public EndedGameEntity addAnswer(QuestionId id, String answer) {
        answers.put(id, answer);
        return this;
    }

    public EndedGameEntity fromStartedGame(StartedGameResult startedGame) {
        this.startedGame = startedGame;
        return this;
    }

    public GameEndResult get() {
        user = context.user().get();
        startedGame = startedGame != null ? startedGame : context.startedGame().get();
        if (answers.isEmpty()) {
            List<Question> questions = startedGame.questions();
            answers.put(questions.get(0).id(), questions.get(0).answer());
        }
        Map.Entry<QuestionId, String> firstAnswer = answers.entrySet().iterator().next();
        GameEnd gameEnd = context.giveAnswerUseCase().giveAnswer(user.userId(), firstAnswer.getKey(), firstAnswer.getValue());
        return new GameEndResult(context, gameEnd);
    }
}
