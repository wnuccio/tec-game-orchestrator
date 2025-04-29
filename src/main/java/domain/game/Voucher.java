package domain.game;

import domain.user.UserId;

public class Voucher {
    private final UserId userId;
    private final String website;
    private final double discount;

    public Voucher(UserId userId, String website, double discount) {
        this.userId = userId;
        this.website = website;
        this.discount = discount;
    }

    public UserId getUserId() {
        return userId;
    }

    public String getWebsite() {
        return website;
    }

    public double getDiscount() {
        return discount;
    }
}