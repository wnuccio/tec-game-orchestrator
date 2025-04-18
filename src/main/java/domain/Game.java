package domain;

import java.util.List;

public class Game {
    private final String userId;
    private final List<String> questions;
    private int points;

    public Game(String userId, List<String> questions) {
        this.userId = userId;
        this.questions = questions;
        this.points = 0;
    }

    public String getUserId() {
        return userId;
    }

    public List<String> getQuestions() {
        return questions;
    }

    public int getPoints() {
        return points;
    }

    public void addPoints(int points) {
        this.points += points;
    }
}
