package domain.game;

import domain.purchase.Voucher;

import java.util.Optional;

public class GameEnd {
    private final boolean isWon;
    private final Voucher voucher;

    public GameEnd(boolean isWon, Voucher voucher) {
        this.isWon = isWon;
        this.voucher = voucher;
    }

    public static GameEnd won(Voucher voucher) {
        return new GameEnd(true, voucher);
    }

    public static GameEnd lost() {
        return new GameEnd(false, null);
    }

    public boolean isWon() {
        return isWon;
    }

    public Optional<Voucher> voucher() {
        return Optional.ofNullable(voucher);
    }
}
