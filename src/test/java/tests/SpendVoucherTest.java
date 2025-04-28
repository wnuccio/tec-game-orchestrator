package tests;

import collections.TestContext;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class SpendVoucherTest {

    private TestContext context;

    @BeforeEach
    void setUp() {
        context = new TestContext();
    }

    @Test
    void user_receives_mail_after_spending_voucher() {
        context.voucherSpent().get();

        assertTrue(context.mailCollection().lastEmailSent().content().contains("Voucher spent"));
    }
}
