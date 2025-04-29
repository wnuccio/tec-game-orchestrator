package usecases;

import domain.game.GameReport;
import domain.game.GameRepository;
import domain.game.Question;
import domain.game.QuestionService;
import domain.mail.Email;
import domain.mail.MailService;
import domain.session.Session;
import domain.session.SessionService;
import domain.session.SessionToken;
import domain.session.Website;
import domain.subscription.SubscriptionService;
import domain.user.UserId;
import domain.user.UserService;

import java.util.List;

public class StartGameUseCase {
    private final UserService userService;
    private final SessionService sessionService;
    private final SubscriptionService subscriptionService;
    private final QuestionService questionService;
    private final GameRepository gameRepository;
    private final MailService mailService;

    public StartGameUseCase(UserService userService, SessionService sessionService, SubscriptionService subscriptionService, QuestionService questionService, GameRepository gameRepository, MailService mailService) {
        this.userService = userService;
        this.sessionService = sessionService;
        this.subscriptionService = subscriptionService;
        this.questionService = questionService;
        this.gameRepository = gameRepository;
        this.mailService = mailService;
    }

    public GameReport startGame(UserId userId, SessionToken token) {
        Session session = sessionService.deserialize(token);
        Website website = subscriptionService.findSubscription(userId).website();

        if (!session.website().equals(website)) {
            return GameReport.startGameFailed();
        }

        String emailAddress = userService.findUserEmail(userId);
        List<Question> questions = questionService.generateQuestions();

        Email email = new Email(
                emailAddress,
                website,
                "Welcome to the game!");

        mailService.sendEmail(email);
        return GameReport.gameStarted(questions);
    }
}