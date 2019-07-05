package GuessNumberHigherOrLower.yanxianni;

/**
 * @ClassName Solution
 * @Description 猜数字大小
 * @Author WangChenYao
 * @Date 2019/6/22 14:04
 * @Version 1.0
 */
public class Solution{
    public int guessNumber(int n) {
        int low = 0;
        int high = n;
        while(low <= high){
            int mid = low + ((high - low) >> 1);
            int res = guess(mid);
            if(res == -1){ //My number is lower
                high = mid - 1;
            }else if(res == 1){ //My number is higher
                low = mid + 1;
            }else{
                return mid;
            }
        }
        return 0;
    }

    private int guess(int mid) {
        return 0;
    }

}
