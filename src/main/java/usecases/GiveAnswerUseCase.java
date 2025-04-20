package usecases;

import domain.game.Game;
import domain.game.GameRepository;
import domain.game.QuestionService;

public class GiveAnswerUseCase {
    private final QuestionService questionService;
    private final GameRepository gameRepository;

    public GiveAnswerUseCase(QuestionService questionService, GameRepository gameRepository) {
        this.questionService = questionService;
        this.gameRepository = gameRepository;
    }

    public void giveAnswer(String userId, String answer) {
        Game game = gameRepository.findByUserId(userId);
        if (questionService.verifyAnswer(answer)) {
            game.addPoints(10); // Example point value
            gameRepository.save(game);
        }
    }
}