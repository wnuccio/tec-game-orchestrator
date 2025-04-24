package usecases;

import domain.game.GameRepository;
import domain.purchase.PurchaseService;

public class RedeemVoucherUseCase {
    private final PurchaseService purchaseService;
    private final GameRepository gameRepository;

    public RedeemVoucherUseCase(PurchaseService purchaseService, GameRepository gameRepository) {
        this.purchaseService = purchaseService;
        this.gameRepository = gameRepository;
    }

    public void redeemVoucher(String userId, String website) {
    }
}
