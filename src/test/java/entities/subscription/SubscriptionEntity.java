package entities.subscription;

import collections.TestContext;
import entities.session.SessionResult;
import entities.user.UserResult;

public class SubscriptionEntity {
    private final TestContext context;
    private UserResult userResult;
    private SessionResult sessionResult;

    public SubscriptionEntity(TestContext context) {
        this.context = context;
    }

    public SubscriptionEntity fromUser(UserResult userResult) {
        this.userResult = userResult;
        return this;
    }

    public SubscriptionResult get() {
        sessionResult = sessionResult != null ? sessionResult : context.session().get();
        userResult = userResult != null ? userResult : context.user().get();
        context.subscribeUserUseCase().subscribeUser(userResult.userId(), sessionResult.token());
        return new SubscriptionResult();
    }
}