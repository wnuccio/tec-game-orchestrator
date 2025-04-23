package domain.game;

public class Question {
    private final QuestionId id;
    private final String question;
    private String answer;

    public Question(QuestionId id, String question, String answer) {
        this.id = id;
        this.question = question;
        this.answer = answer;
    }

    public String question() {
        return question;
    }

    public QuestionId id() {
        return id;
    }

    public String answer() {
        return answer;
    }
}

