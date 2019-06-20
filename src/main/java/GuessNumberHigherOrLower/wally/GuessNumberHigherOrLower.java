package GuessNumberHigherOrLower.wally;

/**
 * @author wally
 */
public class GuessNumberHigherOrLower {
    /**
     * 使用二分法进行遍历。
     * @param n
     * @return
     */
    public int guessNumber(int n){
        int left = 1;
        int right = n;
        for (int i = 0; i <= n /2 ;i++){
            int mid = left + (right - left) / 2;
            if (0 == guess(mid)){
                System.out.println("Congrats! You got it!");
                return mid;
            }else if (-1 == guess(mid)){
                right = mid - 1;
                System.out.println("My number is lower");
            }else if(1 == guess(mid)){
                left = mid + 1;
                System.out.println("My number is higher");
            }
        }
        return 0;
    }
    public static int guess(int n){
        return n;
    }
}
