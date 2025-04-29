package entities.startedgame;

import domain.game.GameReport;
import domain.game.Question;
import domain.user.UserId;
import entities.subscription.SubscriptionResult;

import java.util.List;

public class StartedGameResult {
    private final SubscriptionResult subscription;
    private final GameReport gameReport;

    public StartedGameResult(SubscriptionResult subscription, GameReport gameReport) {
        this.subscription = subscription;
        this.gameReport = gameReport;
    }

    public List<Question> questions() {
        return gameReport.questions();
    }

    public UserId userId() {
        return subscription.userId();
    }

    public boolean isStarted() {
        return gameReport.isStarted();
    }
}
