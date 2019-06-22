/*
 * @lc app=leetcode id=374 lang=java
 *
 * [374] Guess Number Higher or Lower
 */
/* The guess API is defined in the parent class GuessGame.
   @param num, your guess
   @return -1 if my number is lower, 1 if my number is higher, otherwise return 0
      int guess(int num); */

public class Solution extends GuessGame {
    int temp;
    int num;
    public int guessNumber(int n) {
        return checkResult(1,n);
    }
    public int checkResult(int start, int end){
        num=start+(end-start)/2;
        temp=guess(num);
        if(temp==1 & num==start){
            return end;
        }
        if(temp==1){
            return checkResult(num+1,end);
        }else if(temp==-1){
            return checkResult(start,num-1);
        }else{
            return num;
        }
    }
}

