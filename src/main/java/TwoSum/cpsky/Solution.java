package TwoSum.cpsky;

/**
 * @Author: sky
 * @Date: 2019/7/20
 * @Description:
 */
public class Solution {
    public static void main(String[] args) {

    }
    public static int[] twoSum(int[] nums, int target) {
        for(int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] {i,j};
                }
            }
        }
        return null;
    }
}