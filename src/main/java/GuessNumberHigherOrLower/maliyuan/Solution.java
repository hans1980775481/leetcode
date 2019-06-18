package GuessNumberHigherOrLower.maliyuan;

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int left = 1;
        int right = n;
        while (left < right) {
            int min = left + (right - left) / 2;
            if (guess(min)>0) {
                left = min+1;
            } else if(guess(min)<0){
                right = min - 1;
            } else {
                return min;
            }
        }
        return left;
    }
}
