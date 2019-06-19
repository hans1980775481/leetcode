package GuessNumberHigherOrLower.XMHans;

import java.util.Scanner;

public class GuessNumberHigherOrLower extends GuessGame {

    static Scanner cin = new Scanner(System.in);

    static GuessGame guessGame = new GuessGame();

    public static void main(String[] args) {

        int n = cin.nextInt();
        int picked = cin.nextInt();
        guessGame.setVal(picked);
        System.out.println(guessNumber(n));
    }
    public static int guessNumber(int n) {
        int left = 1, right = n;
        int guessNum = 0;
        while (left <= right) {
            guessNum = (right-left)/2 + left;
            if (guessGame.guess(guessNum) == 0) {
                break;
            } else if (guessGame.guess(guessNum) == -1) {
                // left = guessNum+1;
                right = guessNum-1;
            } else {
                left = guessNum+1;
                // right = guessNum-1;
            }
        }
        return guessNum;
    }
}
class GuessGame {
    int val;
    GuessGame(){}
    GuessGame(int val) {
        this.val = val;
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    int guess(int num) {
        if (num > val) return -1;
        else if (num < val) return 1;
        return 0;
    }
}
