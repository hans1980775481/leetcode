package GuessNumberHigherOrLower.graceBaoXP;

public class GuessNumberHigherOrLower {

    public int guessNumber(int n) {
        int low=1;
        int high=n;

        while (low<=high){
            int mid=low+(high-low)/2;
            int temp=guess(mid);
            if(temp==0){
                return mid;
            }else if(temp<0){
               high=--mid;
            }else{
                low=++mid;
            }
        }
        return -1;
    }

    private int guess(int num){
        return 0;
    }
}
