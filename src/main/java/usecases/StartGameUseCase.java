package usecases;

import domain.UserId;
import domain.game.GameRepository;
import domain.game.QuestionService;
import domain.mail.MailService;
import domain.session.SessionService;
import domain.subscription.SubscriptionService;
import domain.user.User;
import domain.user.UserService;

public class StartGameUseCase {
    private final UserService userService;
    private final QuestionService questionService;
    private final GameRepository gameRepository;
    private final MailService mailService;

    public StartGameUseCase(UserService userService, SessionService sessionService, SubscriptionService subscriptionService, QuestionService questionService, GameRepository gameRepository, MailService mailService) {
        this.userService = userService;
        this.questionService = questionService;
        this.gameRepository = gameRepository;
        this.mailService = mailService;
    }

    public void startGame(UserId userId) {
        String emailAddress = userService.findUserEmail(userId);
        mailService.sendEmail(userId, emailAddress, "Welcome to the game!");
    }
}