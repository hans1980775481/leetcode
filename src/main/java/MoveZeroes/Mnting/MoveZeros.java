package MoveZeroes.Mnting;
/*
 * @lc app=leetcode.cn id=283 lang=java
 *
 * [283] 移动零
 */
public class MoveZeros {
    public void moveZeroes(int[] nums) {
        int insertPos = 0;
        for(int num:nums){
            if(num!=0)
                nums[insertPos++] = num;
        }
        while(insertPos<nums.length){
            nums[insertPos++] = 0;
        }
    }
}

