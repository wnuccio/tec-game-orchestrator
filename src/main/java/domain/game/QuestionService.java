package domain.game;

import java.util.List;

public interface QuestionService {
    List<Question> generateQuestions();

    boolean isAnswerCorrect(QuestionId questionId, String answer);
}
