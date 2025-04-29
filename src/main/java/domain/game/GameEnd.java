package domain.game;

import domain.user.UserId;

import java.util.Objects;
import java.util.Optional;

public class GameEnd {
    private final boolean isWon;
    private final Voucher voucher;
    private UserId userId;

    public GameEnd(UserId userId, boolean isWon, Voucher voucher) {
        this.isWon = isWon;
        this.voucher = voucher;
        this.userId = Objects.requireNonNull(userId);
    }

    public static GameEnd won(UserId userId, Voucher voucher) {
        return new GameEnd(userId,true, voucher);
    }

    public static GameEnd lost(UserId userId) {
        return new GameEnd(userId,false, null);
    }

    public boolean isWon() {
        return isWon;
    }

    public Optional<Voucher> voucher() {
        return Optional.ofNullable(voucher);
    }

    public UserId userId() {
        return userId;
    }
}
