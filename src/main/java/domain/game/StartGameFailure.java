package domain.game;

import java.util.Collections;
import java.util.List;

public class StartGameFailure implements GameReport {
    public List<Question> questions() {
        return Collections.emptyList();
    }

    public boolean isStarted() {
        return false;
    }
}
