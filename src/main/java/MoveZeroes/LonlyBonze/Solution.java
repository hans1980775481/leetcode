package MoveZeroes.LonlyBonze;

import java.util.Stack;

public class Solution {
    public void moveZeroes(int[] nums) {
        Stack record = new Stack();
        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] != 0) {
                record.push(nums[i]);
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (record.empty()) {
                nums[i] = 0;
            } else {
                nums[i] = (int) record.pop();
            }
        }
    }
}
