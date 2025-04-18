package tests;

import collections.TestContext;
import entities.SubscribedUserResult;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class SubscribeUserTest {

    private TestContext context;

    @BeforeEach
    void setUp() {
        context = new TestContext();
    }

    @Test
    void user_subscribes_on_website() {
        SubscribedUserResult subscribedUserResult = context.subscribedUserEntity().get();

        assertNotNull(subscribedUserResult);
    }
}
