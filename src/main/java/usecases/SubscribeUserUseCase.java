package usecases;

import domain.Session;
import domain.SessionService;
import domain.SessionToken;
import domain.Subscription;
import domain.SubscriptionService;
import domain.UnregisteredUserException;
import domain.UserService;

public class SubscribeUserUseCase {
    private final UserService userService;
    private final SessionService sessionService;
    private final SubscriptionService subscriptionService;

    public SubscribeUserUseCase(UserService userService, SessionService sessionService, SubscriptionService subscriptionService) {
        this.userService = userService;
        this.sessionService = sessionService;
        this.subscriptionService = subscriptionService;
    }

    public void subscribeUser(int userId, SessionToken sessionToken) {
        if (!userService.existsUser(userId)) {
            throw new UnregisteredUserException(userId);
        }
        Session session = sessionService.deserialize(sessionToken);
        Subscription subscription = new Subscription(userId, session.website());
        subscriptionService.subscribe(subscription);
    }
}
