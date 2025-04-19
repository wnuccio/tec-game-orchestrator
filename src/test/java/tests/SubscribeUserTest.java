package tests;

import collections.TestContext;
import domain.UserId;
import domain.user.UnregisteredUserException;
import entities.session.SessionResult;
import entities.subscription.SubscriptionResult;
import entities.user.UserResult;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class SubscribeUserTest {

    private TestContext context;

    @BeforeEach
    void setUp() {
        context = new TestContext();
    }

    @Test
    void user_subscribes_on_website() {
        SubscriptionResult subscriptionResult = context.subscription().get();

        assertNotNull(subscriptionResult);
    }

    @Test
    void not_registered_user_cannot_subscribe() {
        SessionResult session = context.session().get();

        assertThrows(UnregisteredUserException.class, () ->
                context.subscribeUserUseCase().subscribeUser(new UserId(1), session.token()));
    }

    @Test
    void subscription_has_userId() {
        UserResult user = context.user().withUserId(10).get();

        SubscriptionResult subscription = context.subscription().fromUser(user).get();

        assertEquals(subscription.userId().id(), 10);
    }
}
