package entities.endedgame;

import collections.TestContext;
import domain.game.GameEnd;
import domain.game.Voucher;
import domain.user.UserId;

import java.util.Optional;

public class GameEndResult {
    private final TestContext context;
    private final GameEnd gameEnd;

    public GameEndResult(TestContext context, GameEnd gameEnd) {
        this.context = context;
        this.gameEnd = gameEnd;
    }

    public GameEnd gameEnd() {
        return gameEnd;
    }

    public Optional<Voucher> voucher() {
        return gameEnd.voucher();
    }

    public UserId userId() {
        return gameEnd.userId();
    }
}
