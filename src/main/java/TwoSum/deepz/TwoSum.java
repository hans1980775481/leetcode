package TwoSum.deepz;

import java.util.HashMap;
import java.util.Map;

/**
 * @author DeepSleeping
 * @date 2019/7/15 22:29
 * @description 两数之和
 * 执行用时 :8 ms, 在所有 Java 提交中击败了78.53% 的用户
 * 内存消耗 :39.1 MB, 在所有 Java 提交中击败了48.44%的用户
 */
public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}
