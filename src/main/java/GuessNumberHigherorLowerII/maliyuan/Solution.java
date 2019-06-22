package GuessNumberHigherorLowerII.maliyuan;

import org.omg.CORBA.INTERNAL;

public class Solution {
    Integer [][] number;
    public int getMoneyAmount(int n) {
        number= new Integer[n+1][n+1];
        return spendPrice(1,n);
    }
    public  int spendPrice(int left,int right) {
        if (left>=right) {
            return 0;
        }
        if (number[left][right] != null) {
            return number[left][right];
        }
        int min = Integer.MAX_VALUE;
        int i = left+(right-left)/2;
        while (i<=right){
            int max = Math.max(spendPrice(left,i-1),spendPrice(i+1,right))+i;
            min = Math.min(min,max);
            i++;
        }
        number[left][right] = min;
        return min;
    }
}
