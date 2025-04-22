package entities.startedgame;

import domain.game.Question;

import java.util.List;

public class StartedGameResult {
    private List<Question> questions;

    public StartedGameResult(List<Question> questions) {
        this.questions = questions;
    }

    public List<Question> questions() {
        return questions;
    }
}
