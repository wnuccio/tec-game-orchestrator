package entities.startedgame;

import collections.TestContext;
import domain.game.Question;
import entities.question.QuestionResult;
import entities.user.UserResult;

import java.util.List;

public class StartedGameEntity {
    private final TestContext context;
    private UserResult user;
    private QuestionResult questions;

    public StartedGameEntity(TestContext context) {
        this.context = context;
    }

    public StartedGameEntity fromUser(UserResult user) {
        this.user = user;
        return this;
    }

    public StartedGameEntity fromQuestions(QuestionResult questions) {
        this.questions = questions;
        return this;
    }

    public StartedGameResult startGame() {
        user = user != null ? user : context.user().get();
        questions = questions != null ? questions : context.question()
                .withQuestions("What's your name?").get();

        List<Question> questions = context.startGameUseCase().startGame(user.userId());
        return new StartedGameResult(questions);
    }
}
