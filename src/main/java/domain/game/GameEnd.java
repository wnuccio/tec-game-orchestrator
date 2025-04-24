package domain.game;

import domain.purchase.Voucher;

import java.util.Optional;

public class GameEnd {
    private final boolean isWon;

    public GameEnd(boolean isWon) {
        this.isWon = isWon;
    }

    public static GameEnd won() {
        return new GameEnd(true);
    }

    public static GameEnd lost() {
        return new GameEnd(false);
    }

    public boolean isWon() {
        return isWon;
    }

    public Optional<Voucher> voucher() {
        return Optional.empty();
    }
}
