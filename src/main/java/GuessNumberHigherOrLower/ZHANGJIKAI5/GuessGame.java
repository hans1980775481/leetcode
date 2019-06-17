package GuessNumberHigherOrLower.ZHANGJIKAI5;

public class GuessGame {

    public int guess(int num) {
        if (num > 10) {
            return -1;
        } else if (num < 10) {
            return 1;
        }
        return 0;
    }
}
