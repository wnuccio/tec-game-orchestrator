package domain;

public class Voucher {
    private final String userId;
    private final String website;
    private final double discount;

    public Voucher(String userId, String website, double discount) {
        this.userId = userId;
        this.website = website;
        this.discount = discount;
    }

    public String getUserId() {
        return userId;
    }

    public String getWebsite() {
        return website;
    }

    public double getDiscount() {
        return discount;
    }
}