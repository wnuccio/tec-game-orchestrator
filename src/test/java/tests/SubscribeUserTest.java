package tests;

import collections.TestContext;
import domain.SessionToken;
import domain.UnregisteredUserException;
import domain.User;
import entities.SessionResult;
import entities.SubscriptionEntity;
import entities.SubscriptionResult;
import entities.UserResult;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

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
                context.subscribeUserUseCase().subscribeUser(1, session.token()));
    }
}
