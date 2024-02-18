
public class GameController {
    private Game game;

    public GameController(Game game) {
        this.game = game;
    }
    
    public void startGame() {
        game.initialize();
        while (game.isRunning()) {
            game.processInput();
        }
        game.endGame();
    }
}
    

