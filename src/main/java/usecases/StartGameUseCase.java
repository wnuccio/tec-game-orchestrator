package usecases;

import domain.game.GameRepository;
import domain.game.Question;
import domain.game.QuestionService;
import domain.mail.Email;
import domain.mail.MailService;
import domain.session.SessionService;
import domain.session.Website;
import domain.subscription.SubscriptionService;
import domain.user.UserId;
import domain.user.UserService;

import java.util.List;

public class StartGameUseCase {
    private final UserService userService;
    private final SubscriptionService subscriptionService;
    private final QuestionService questionService;
    private final GameRepository gameRepository;
    private final MailService mailService;

    public StartGameUseCase(UserService userService, SessionService sessionService, SubscriptionService subscriptionService, QuestionService questionService, GameRepository gameRepository, MailService mailService) {
        this.userService = userService;
        this.subscriptionService = subscriptionService;
        this.questionService = questionService;
        this.gameRepository = gameRepository;
        this.mailService = mailService;
    }

    public List<Question> startGame(UserId userId) {
        String emailAddress = userService.findUserEmail(userId);
        Website website = subscriptionService.findSubscription(userId).website();
        List<Question> questions = questionService.generateQuestions();

        Email email = new Email(
                emailAddress,
                website,
                "Welcome to the game!");

        mailService.sendEmail(email);
        return questions;
    }
}