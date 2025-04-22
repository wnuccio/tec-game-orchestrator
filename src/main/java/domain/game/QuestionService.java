package domain.game;

import java.util.List;

public interface QuestionService {
    List<Question> generateQuestions();

    boolean verifyAnswer(String answer);
}
