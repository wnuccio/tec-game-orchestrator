package domain.game;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GameReport {
    private final List<Question> questions;

    public GameReport(List<Question> questions) {
        this.questions = questions;
    }

    public static GameReport failed() {
        return new GameReport(Collections.emptyList());
    }

    public List<Question> questions() {
        return new ArrayList<>(questions);
    }

    public boolean isStarted() {
        return !questions.isEmpty();
    }
}
