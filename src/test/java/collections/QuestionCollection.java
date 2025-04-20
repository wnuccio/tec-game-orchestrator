package collections;

import domain.game.QuestionService;

import java.util.List;

public class QuestionCollection implements QuestionService {
    @Override
    public List<String> generateQuestions() {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    @Override
    public boolean verifyAnswer(String answer) {
        throw new UnsupportedOperationException("Not implemented yet");
    }
}
