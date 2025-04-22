package entities;

import domain.Question;

import java.util.List;

public class QuestionResult {
    private final List<Question> questions;

    public QuestionResult(List<Question> questions) {
        this.questions = questions;
    }
}
