package GuessNumberHigherOrLower.Zntao;

public class GuessNumberHigherOrLower extends GuessGame {

    public int guessNumber(int n) {
        int left = 1;
        int right = n;
        while(left<= right){
            int mid = left + (right -left)/2;
            int result = guess(mid);
            if(result == 1){
                left = mid + 1;
            }
            else if(result == -1){
                right = mid -1;
            }
            else{
                return mid;
            }
        }
        return 0;
    }


    // 第二种，用递归的方式
    private int digui(int low, int high){
        int mid = low + (high-low)/2;
        if (guess(mid) == 0){
            return mid;
        }
        else if (guess(mid) == -1){
            return digui(low, mid);
        }
        else {
            return digui(mid, high);
        }
    }
}
