package domain.game;

import domain.UserId;

import java.util.List;

public class Game {
    private final UserId userId;
    private final List<String> questions;
    private int points;

    public Game(UserId userId, List<String> questions) {
        this.userId = userId;
        this.questions = questions;
        this.points = 0;
    }

    public UserId getUserId() {
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
