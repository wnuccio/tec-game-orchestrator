package entities.voucherspent;

import collections.TestContext;
import entities.endedgame.GameEndResult;

public class VoucherSpentEntity {
    private final TestContext context;
    private GameEndResult endedGame;

    public VoucherSpentEntity(TestContext context) {
        this.context = context;
    }

    public VoucherSpentResult get() {
        endedGame = endedGame != null ? endedGame : context.endedGame().get();
        context.spendVoucherUseCase().spendVoucher(endedGame.userId());
        return new VoucherSpentResult(context);
    }
}
