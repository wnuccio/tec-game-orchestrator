package domain.game;

import java.util.List;

public interface GameService {
    List<String> generateQuestions();
    boolean verifyAnswer(String answer);
}
