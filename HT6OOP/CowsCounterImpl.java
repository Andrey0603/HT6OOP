
public class CowsCounterImpl implements CowsCounter {

    @Override
    public int countCows(String secret, String guess) {
        int cows = 0;
        for (int i = 0; i < secret.length(); i++) {
            char currentDigit = guess.charAt(i);
            if (secret.contains(String.valueOf(currentDigit)) && secret.charAt(i) != currentDigit) {
                cows++;
            }
        }
        return cows;
    }
}

// Принцип единственной ответственности, CowsCounterImpl отвечает только за подсчет коров.
// Принцип открытости(закрытости), класс CowsCounterImpl реализует интерфейс CowsCounter.