package usecases;

import domain.UserId;
import domain.session.Session;
import domain.session.SessionService;
import domain.session.SessionToken;
import domain.subscription.Subscription;
import domain.subscription.SubscriptionService;
import domain.user.UnregisteredUserException;
import domain.user.UserService;

public class SubscribeUserUseCase {
    private final UserService userService;
    private final SessionService sessionService;
    private final SubscriptionService subscriptionService;

    public SubscribeUserUseCase(UserService userService, SessionService sessionService, SubscriptionService subscriptionService) {
        this.userService = userService;
        this.sessionService = sessionService;
        this.subscriptionService = subscriptionService;
    }

    public Subscription subscribeUser(UserId userId, SessionToken sessionToken) {
        if (!userService.existsUser(userId)) {
            throw new UnregisteredUserException(userId);
        }
        Session session = sessionService.deserialize(sessionToken);
        Subscription subscription = new Subscription(userId, session.website());
        subscriptionService.subscribe(subscription);
        return subscription;
    }
}
