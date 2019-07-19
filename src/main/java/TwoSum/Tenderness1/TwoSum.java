package TwoSum.Tenderness1;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums={2,7,11,15};
        int[] ints = twoSum(nums, 9);
        for (int i = 0; i < ints.length; i++) {
            System.out.println(ints[i]);
        }
    }

    /**
     * TODO 思路：运用哈希map 目标为两个 和为目标值 遍历整个数组 首先取一个值 放入map中 如果剩余的值与目标值差为map中的元素
     * TODO 说明存在两个值和为目标值 返回坐标
     * @param nums
     * @param target
     * @return
     */
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("数组中无两数之和为目标值");
    }

}
