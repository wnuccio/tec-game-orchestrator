package domain.purchase;

public interface PurchaseRepository {
    void savePurchase(String userId, String website, double amount);
}
