package GuessNumberHigherOrLower.wangwangyuwan;

public class Solution {
    public int guessNumber(int n) {
        int low = 1;
        int high = n;
        while(low<high){
            int mid = low+(high-low)/2;
            int x = num(mid);
            if(x == 0){
                return mid;
            }else if(x == 1){
                low = mid+1;
            }else {
                high = mid;
            }
        }
        return low;
    }
    int num(int num){
        return 0;
    }
}
