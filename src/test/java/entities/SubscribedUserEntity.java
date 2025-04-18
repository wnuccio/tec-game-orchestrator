package entities;

import collections.TestContext;

public class SubscribedUserEntity {
    private String userId;
    private String website;
    private final TestContext context;

    public SubscribedUserEntity(TestContext context) {
        this.context = context;
    }

    public SubscribedUserEntity withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    public SubscribedUserEntity withWebsite(String website) {
        this.website = website;
        return this;
    }

    public SubscribedUserResult get() {
        context.getSubscribeUserUseCase().subscribeUser(userId, website);
        return new SubscribedUserResult();
    }
}