package domain.game;

public class QuestionId {
    private final int id;

    public QuestionId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "QuestionId{" +
                "id=" + id +
                '}';
    }
}
