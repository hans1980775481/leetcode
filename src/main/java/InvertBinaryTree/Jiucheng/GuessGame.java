package InvertBinaryTree.Jiucheng;

public class GuessGame {
    public int guessNumber(int n) {
        int left=1;
        int right=n;
        int m=0;
        while(true){
            m=left+(right-left)/2;
            int res=guess(m);
            if(res==-1){
                right=m;
            }else if(res==1){
                left=m+1;
            }else{
                break;
            }
        }
        return m;
    }
    public int guess(int num){
        return 0;
    }
}
