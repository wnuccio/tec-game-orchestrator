package usecases;

import domain.game.Game;
import domain.game.GameRepository;
import domain.game.GameService;

public class GiveAnswerUseCase {
    private final GameService gameService;
    private final GameRepository gameRepository;

    public GiveAnswerUseCase(GameService gameService, GameRepository gameRepository) {
        this.gameService = gameService;
        this.gameRepository = gameRepository;
    }

    public void giveAnswer(String userId, String answer) {
        Game game = gameRepository.findByUserId(userId);
        if (gameService.verifyAnswer(answer)) {
            game.addPoints(10); // Example point value
            gameRepository.save(game);
        }
    }
}