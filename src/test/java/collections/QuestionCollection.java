package collections;

import domain.game.Question;
import domain.game.QuestionId;
import domain.game.QuestionService;

import java.util.ArrayList;
import java.util.List;

public class QuestionCollection implements QuestionService {
    private List<Question> questions;

    public QuestionCollection() {
        this.questions = new ArrayList<>();
    }

    @Override
    public List<Question> generateQuestions() {
        return new ArrayList<>(questions);
    }

    @Override
    public boolean verifyAnswer(String answer) {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public void addAll(List<Question> questions) {
        this.questions.clear();
        this.questions.addAll(questions);
    }

    public QuestionId nextId() {
        return new QuestionId(questions.size() + 1);
    }
}
