package GuessNumberHigherOrLower.mayuqingxx;

public class GuessNumber {
    public int guessNumber(int n) {
        int a = 1;
        int b = n;
        while (a <= b) {
            int mid = a + (b-a)/2;
            if (0 == guess(mid)) {
                return mid;
            } else if (1 == guess(mid)) {
                a = mid+1;
            } else {
                b = mid-1;
            }
        }
        return 0;
    }

    int guess(int i) {
        if (1 == i) {
            return i;
        } else if (-1 == i) {
            return i;
        } else {
            return 0;
        }
    }
}
