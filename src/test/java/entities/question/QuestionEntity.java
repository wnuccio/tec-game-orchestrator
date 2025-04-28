package entities.question;

import collections.TestContext;
import domain.game.Question;
import domain.game.QuestionId;

import java.util.ArrayList;
import java.util.List;

public class QuestionEntity {
    private final TestContext context;
    private final List<Question> questions;

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
        if (questions.isEmpty()) {
            this.addQuestion("What's your name?", "John");
        }
        context.questionCollection().addAll(questions);
        return new QuestionResult(questions);
    }
}
