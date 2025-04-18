package tests;

import collections.TestContext;
import entities.SubscribedUserResult;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class SubscribeUserTest {
    @Test
    void user_subscribes_on_website() {
        TestContext context = new TestContext();

        SubscribedUserResult subscribedUserResult = context.subscribedUserEntity().get();

        assertNotNull(subscribedUserResult);
    }
}
