package TwoSum.LiuMinghao;

import java.util.Arrays;

public class TwoSum {

    public static int[] twoSum(int[] nums, int target) {
        int flag = 0;
        int[] values = new int[2];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > target) {
                continue;
            } else {
                int temp = target - nums[i];
                for (int j = 0; j < nums.length; j++) {
                    if (nums[j] == temp) {
                        flag = 1;
                        values[0] = i;
                        values[1] = j;
                        break;
                    }
                }
            }
            if (flag == 1) {
                return values;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        int[] nums = {2, 3, 4};
        System.out.println(Arrays.toString(twoSum(nums, 6)));
    }
}
