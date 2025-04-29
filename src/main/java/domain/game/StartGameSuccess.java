package domain.game;

import java.util.ArrayList;
import java.util.List;

public class StartGameSuccess implements GameReport {
    private final List<Question> questions;

    StartGameSuccess(List<Question> questions) {
        this.questions = questions;
    }

    public List<Question> questions() {
        return new ArrayList<>(questions);
    }

    public boolean isStarted() {
        return true;
    }
}
