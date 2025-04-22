package entities;

import collections.TestContext;
import domain.Question;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class QuestionEntity {
    private final TestContext context;
    private List<Question> questions;

    public QuestionEntity(TestContext context) {
        this.context = context;
    }

    public QuestionEntity withQuestions(String... questions) {
        this.questions = Stream.of(questions)
                .map(Question::new)
                .collect(toList());
        return this;
    }

    public QuestionResult get() {
        context.questionCollection().addAll(questions);
        return new QuestionResult(questions);
    }
}
