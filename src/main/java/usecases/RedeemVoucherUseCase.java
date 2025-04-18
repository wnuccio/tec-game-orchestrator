package usecases;

import domain.game.Game;
import domain.game.GameRepository;
import domain.purchase.PurchaseService;
import domain.purchase.Voucher;

public class RedeemVoucherUseCase {
    private final PurchaseService purchaseService;
    private final GameRepository gameRepository;

    public RedeemVoucherUseCase(PurchaseService purchaseService, GameRepository gameRepository) {
        this.purchaseService = purchaseService;
        this.gameRepository = gameRepository;
    }

    public void redeemVoucher(String userId, String website) {
        Game game = gameRepository.findByUserId(userId);
        if (game.getPoints() >= 100) { // Example threshold
            Voucher voucher = new Voucher(userId, website, 20.0); // Example discount
            purchaseService.applyVoucher(voucher);
        }
    }
}
