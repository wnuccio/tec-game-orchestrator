package usecases;

import domain.Game;
import domain.GameRepository;
import domain.GameService;

import java.util.List;

public class StartGameUseCase {
    private final GameService gameService;
    private final GameRepository gameRepository;

    public StartGameUseCase(GameService gameService, GameRepository gameRepository) {
        this.gameService = gameService;
        this.gameRepository = gameRepository;
    }

    public void startGame(String userId) {
        List<String> questions = gameService.generateQuestions();
        Game game = new Game(userId, questions);
        gameRepository.save(game);
    }
}