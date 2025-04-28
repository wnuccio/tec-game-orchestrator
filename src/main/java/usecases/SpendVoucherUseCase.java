package usecases;

import domain.game.GameRepository;
import domain.mail.Email;
import domain.mail.MailService;
import domain.session.Website;
import domain.subscription.SubscriptionService;
import domain.user.UserId;
import domain.user.UserService;

public class SpendVoucherUseCase {
    private final UserService userService;
    private final SubscriptionService subscriptionService;
    private final GameRepository gameRepository;
    private final MailService mailService;

    public SpendVoucherUseCase(UserService userService, SubscriptionService subscriptionService, GameRepository gameRepository, MailService mailService) {
        this.userService = userService;
        this.subscriptionService = subscriptionService;
        this.gameRepository = gameRepository;
        this.mailService = mailService;
    }

    public void spendVoucher(UserId userId) {
        String address = userService.findUserEmail(userId);
        Website website = subscriptionService.findSubscription(userId).website();
        Email email = new Email(address, website, "Voucher spent");
        mailService.sendEmail(email);
    }
}
