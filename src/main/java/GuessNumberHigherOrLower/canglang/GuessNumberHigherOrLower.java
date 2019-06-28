public class GuessNumberHigherOrLower extends GuessGame {
    public int guessNumber(int n) {
        int mid=n/2;
        int start=1;
        int end=n;
        while (start<=end){
            mid=start+(end-start)/2;
            int res=guess(mid);
            if(res==0){
                return mid;
            }
            else if(res==-1){
                end=mid-1;
            }
            else {
                start=mid+1;
            }
        }
        return -1;
    }
}