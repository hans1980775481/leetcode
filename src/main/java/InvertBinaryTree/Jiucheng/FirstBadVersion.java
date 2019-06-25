package InvertBinaryTree.Jiucheng;

public class FirstBadVersion  {
    public int firstBadVersion(int n) {
        int left=1;
        int right=n;
        while(left<right){
            int mis=left+(right-left)/2;
            if(isBadVersion(mis)){
                right=mis;
            }else{
                left=mis+1;
            }
        }
        return left;
    }

    public boolean isBadVersion(int version){
        return true;
    }
}
