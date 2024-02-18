
public class BullsCounterImpl implements BullsCounter {
    @Override
    public int countBulls(String secret, String guess) {
        int bulls = 0;
        for (int i = 0; i < secret.length(); i++) {
            if (secret.charAt(i) == guess.charAt(i)) {
                bulls++;
            }
        }
        return bulls;
    }
}

// Принцип единственной ответственности, BullsCounterImpl отвечает только за подсчет быков.
// Принцип открытости(закрытости), класс BullsCounterImp реализует интерфейс BullsCounter.