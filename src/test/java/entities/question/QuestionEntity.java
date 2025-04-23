package entities.question;

import collections.TestContext;
import domain.game.Question;
import domain.game.QuestionId;

import java.util.ArrayList;
import java.util.List;

public class QuestionEntity {
    private final TestContext context;
    private List<Question> questions;

    public QuestionEntity(TestContext context) {
        this.context = context;
        this.questions = new ArrayList<>();
    }

    public QuestionEntity addQuestion(String question, String answer) {
        QuestionId id  = context.questionCollection().nextId();
        questions.add(new Question(id, question, answer));
        return this;
    }

    public QuestionResult get() {
        context.questionCollection().addAll(questions);
        return new QuestionResult(questions);
    }
}
