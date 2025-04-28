package usecases;

import domain.game.GameEnd;
import domain.game.GameRepository;
import domain.game.QuestionId;
import domain.game.QuestionService;
import domain.purchase.Voucher;
import domain.user.UserId;

public class GiveAnswerUseCase {
    private final QuestionService questionService;
    private final GameRepository gameRepository;

    public GiveAnswerUseCase(QuestionService questionService, GameRepository gameRepository) {
        this.questionService = questionService;
        this.gameRepository = gameRepository;
    }

    public GameEnd giveAnswer(UserId userId, QuestionId questionId, String answer) {
        if (!questionService.isAnswerCorrect(questionId, answer)) {
            return GameEnd.lost(userId);
        }
        Voucher voucher = new Voucher(userId, null, 1.00);
        return GameEnd.won(userId, voucher);
    }
}