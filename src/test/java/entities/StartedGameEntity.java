package entities;

import collections.TestContext;
import entities.user.UserResult;
import usecases.StartGameUseCase;

public class StartedGameEntity {
    private final TestContext context;
    private UserResult user;

    public StartedGameEntity(TestContext context) {
        this.context = context;
    }

    public StartedGameEntity fromUser(UserResult user) {
        this.user = user;
        return this;
    }

    public StartedGameResult startGame() {
        context.startGameUseCase().startGame(user.userId());
        return new StartedGameResult();
    }
}
