package domain.game;

public class Question {
    private final QuestionId id;
    private final String question;

    public Question(QuestionId id, String question) {
        this.id = id;
        this.question = question;
    }

    public String question() {
        return question;
    }
}

