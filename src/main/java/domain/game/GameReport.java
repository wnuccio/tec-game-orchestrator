package domain.game;

import java.util.List;

public interface GameReport {
    static GameReport gameStarted(List<Question> questions) {
        return new StartGameSuccess(questions);
    }

    static GameReport startGameFailed() {
        return new StartGameFailure();
    }

    List<Question> questions();

    boolean isStarted();
}
