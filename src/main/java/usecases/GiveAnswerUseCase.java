package usecases;

import domain.game.GameRepository;
import domain.game.QuestionId;
import domain.game.QuestionService;
import domain.user.UserId;

public class GiveAnswerUseCase {
    private final QuestionService questionService;
    private final GameRepository gameRepository;

    public GiveAnswerUseCase(QuestionService questionService, GameRepository gameRepository) {
        this.questionService = questionService;
        this.gameRepository = gameRepository;
    }

    public GameEnd giveAnswer(UserId userId, QuestionId questionId, String answer) {
        return GameEnd.won();
    }
}