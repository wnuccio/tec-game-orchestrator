package domain;

public interface PurchaseRepository {
    void savePurchase(String userId, String website, double amount);
}
