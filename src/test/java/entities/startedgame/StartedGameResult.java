package entities.startedgame;

import domain.game.Question;
import domain.user.UserId;
import entities.subscription.SubscriptionResult;

import java.util.List;

public class StartedGameResult {
    private final SubscriptionResult subscription;
    private List<Question> questions;

    public StartedGameResult(SubscriptionResult subscription, List<Question> questions) {
        this.subscription = subscription;
        this.questions = questions;
    }

    public List<Question> questions() {
        return questions;
    }

    public UserId userId() {
        return subscription.userId();
    }
}
