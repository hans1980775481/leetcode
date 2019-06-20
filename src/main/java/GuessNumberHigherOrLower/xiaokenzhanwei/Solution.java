package GuessNumberHigherOrLower.xiaokenzhanwei;

/**
 * @author 小坑占位 create date by 2019/6/20 16:51
 */
public class Solution extends GuessGame{

    public Solution(int designationNumber) {
        super(designationNumber);
    }

    public int guessNumber(int n) {
        int low = 1, high = n;
        while (low < high){
            int mid = low + (high - low)/2;
            int result = guess(mid);
            switch(result){
                case 0:
                    return mid;
                case 1:
                    high = mid - 1;break;
                case -1:
                    low = mid + 1;break;
                default:
                   return -1;
            }
        }
        return low;
    }
}
