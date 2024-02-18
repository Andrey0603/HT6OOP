
public class Main {
    public static void main(String[] args) {
        GameController gameController = new GameController(new GameNumber(new BullsCounterImpl(), new CowsCounterImpl(), new InputHandler()));
        gameController.startGame();
    }
}
    

// Малинин Андрей