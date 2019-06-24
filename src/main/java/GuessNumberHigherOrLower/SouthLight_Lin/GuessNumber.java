package GuessNumberHigherOrLower.SouthLight_Lin;

/**
 * 猜数游戏：
 *      输入一个数n，有一个API  guess(int num)可以调用，它会告诉你你猜的数是高了还是低了
 *      guess()返回-1表示低了，1表示高了，0表示猜对了
 * @author SouthLight-Lin on 2019/6/23
 */
public class GuessNumber {
    /**
     * 思路：
     *      使用二分法来查找，通过折半能够时间复杂度降为O(n)
     *  步骤：
     *      1、判断输入的n是否符合要求
     *      2、定义两个数l 和 r
     *      3、求出mid = (r-l)/2+l
     *      4、调用guess(mid)
     *      5、返回0表示猜对了，返回-1时，让l=mid+1，返回1时，让r=mid-1
     *      6、重复3到5的步骤，直到猜对
     */

    public int guessNumber(int n) {
        if (n==0){
            return 0;
        }
        int l = 0, r = n;
        while (l <= r){
            int mid = l+(r-l)/2;
            int result = guess(mid);
            // 猜对了
            if ( result == 0){
                return mid;
            }
            // 猜大了
            else if (result < 0){
                r = mid-1;
            }
            // 猜小了
            else {
                l = mid+1;
            }
        }
        // 没找到
        return -1;
    }

    public int guess(int n){
        int result = 6;
        if (n==result){
            return 0;
        }
        else if (n > result){
            return 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        GuessNumber guessNumber = new GuessNumber();
        System.out.println(guessNumber.guessNumber(10));
    }
}
