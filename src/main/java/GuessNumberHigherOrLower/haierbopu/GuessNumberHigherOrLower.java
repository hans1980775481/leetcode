/* The guess API is defined in the parent class GuessGame.
   @param num, your guess
   @return -1 if my number is lower, 1 if my number is higher, otherwise return 0
      int guess(int num); */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int l = 1;
        int r = n;
        //still same binary search like problem 1, but one more condition for correct answer
        while (l < r){
            int temp = (r - l)/2 + l;
            if (guess(temp) == 0){
                return temp;
            }
            else if (guess(temp) < 0){
                r = temp;
            }
            else{
                l = temp + 1;
            }
        }
        return l;
    }
}