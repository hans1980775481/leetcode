/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        return binarrySearch(1,n);
    }
    public int binarrySearch(int start,int end){
        if(start>end){
            return start;
        }
        //int i=(start+end)/2
        //ÄÚ´æÒç³ö
        int i=start+(end-start)/2;
        if(!isBadVersion(i)){
            return binarrySearch(i+1,end);
        }
        else{
            return binarrySearch(start,i-1);
        }
    }
}