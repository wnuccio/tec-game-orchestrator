package domain.game;

import java.util.List;

public interface QuestionService {
    List<String> generateQuestions();
    boolean verifyAnswer(String answer);
}
