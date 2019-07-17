package ShortestUnsortedContinuousSubarray.yangshuai;

/**
 * Solution
 *
 * @author shuai
 * @date 2019/7/17
 */
public class Solution {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        int unsortedSubarray = findUnsortedSubarray(nums);
        System.out.println(unsortedSubarray);
    }

    public static int findUnsortedSubarray(int[] nums) {
        int length = nums.length;
        int index = 0;
        int end_index = length - 1;

        loop:
        while (true) {
            int min = nums[index];
            for (int i = index + 1; i < length; i++) {
                if (nums[i] < min) {
                    break loop;
                }
            }
            if (index < length - 1) {
                index += 1;
            } else {
                break loop;
            }
        }
        loop:
        while (true) {
            int max = nums[end_index];
            for (int i = end_index - 1; i >= 0; i--) {
                if (nums[i] > max) {
                    break loop;
                }
            }
            if (end_index > 0) {
                end_index -= 1;
            } else {
                break loop;
            }
        }
        return end_index - index >= 0 ? end_index - index + 1 : 0;
    }
}
