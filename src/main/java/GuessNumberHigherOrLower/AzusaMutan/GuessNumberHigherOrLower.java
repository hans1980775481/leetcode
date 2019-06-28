package GuessNumberHigherOrLower.AzusaMutan;

public class GuessNumberHigherOrLower {
    public int guessNumber(int n) {
        if(guess(n) == 0) return n;
        return f(1,n);
    }
    public int f(int begin, int end) {
        if(begin == end) {
            if (guess(begin) == 0) return begin;
        }
        int mid = begin+(end-begin)/2;
        if(guess(mid) == 0) {
            return mid;
        } else if (guess(mid) < 0) {
            return f (begin,mid);
        } else return f(mid,end);
    }
    public int guess(int n) {
        return 0;
    }
}
