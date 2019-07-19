package RotateArray.maliyuan;

public class Solution {
    public void rotate(int[] nums, int k) {
        for(int i=0;i<k;i++){
            int p = nums[nums.length-1];
            for(int j=0;j<nums.length;j++){
                int temp = nums[j];
                nums[j] = p;
                p = temp;
            }
        }
    }
}
