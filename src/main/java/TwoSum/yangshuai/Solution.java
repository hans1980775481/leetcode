package TwoSum.yangshuai;

import java.util.HashMap;
import java.util.Map;

/**
 * Solution
 *
 * @author shuai
 * @date 2019/7/18
 */
public class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> integers = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (integers.containsKey(nums[i])) {
                return new int[]{integers.get(nums[i]), i};
            }
            integers.put(target - nums[i], i);
        }
        return null;
    }
}
