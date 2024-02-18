

public class GameNumber implements Game{

    private final String secretNumber = "1234";
    private int attempts = 0;
    private boolean running = true;
    private BullsCounter bullsCounter;
    private CowsCounter cowsCounter;
    private InputHandler inputHandler;

    public GameNumber(BullsCounter bullsCounter, CowsCounter cowsCounter, InputHandler inputHandler) {
        this.bullsCounter = bullsCounter;
        this.cowsCounter = cowsCounter;
        this.inputHandler = inputHandler;
    }

    @Override
    public void initialize() {
        System.out.println("Добро пожаловать  в игру Бфки и коровы! Попробуйте ввести загаданое число.");
    }

    @Override
    public void processInput() {
        System.out.print("Введите число: ");
        String userGuess = inputHandler.getUserInput();

       
        int bulls = bullsCounter.countBulls(secretNumber, userGuess);
        int cows = cowsCounter.countCows(secretNumber, userGuess);

       
        System.out.println("Bulls: " + bulls + ", Cows: " + cows);

        attempts++;
    }

    @Override
    public boolean isRunning() {
        return running && attempts < 10; 
    }

    @Override
    public void endGame() {
        System.out.println("Game Over! The secret number was: " + secretNumber);
    }
}

// Принцип инверсии зависимостей,класс GameNumber,  работает через интерфейсы, что позволяет добавлять новую функциональность без изменения исходного кода.