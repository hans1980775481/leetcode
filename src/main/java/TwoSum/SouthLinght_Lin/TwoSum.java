package TwoSum.SouthLinght_Lin;

import java.util.HashMap;
import java.util.Map;

/**
 * 输入一个数组和一个target数，输出数组中两个数的下标，使和为target
 * 例如：
 * 输入：[4,7,2,14]  target=11
 * 输出：[0,1]
 * 限制：每个数只能遍历一次，也就是限制时间复杂度最多为O(n)
 * @author SouthLight-Lin on 2019/7/15
 */
public class TwoSum {

    /**
     * 思路：
     *      使用辅助结构HashMap，来存放遍历的数，key为值，value为下标
     * 步骤：
     *      1、遍历数组，如果diff = target-nums[i]，如果map.get(diff)!==null，
     *          证明这两个数相加等于target，返回这两个下标
     *      2、如果diff!=target-nums[i]，将nums[i]添加进map中
     *      3、遍历知道结束。没有就返回null
     */
    public int[] twoSum(int[] nums, int target){
        if (nums==null || nums.length<=1)
            return null;

        Map<Integer, Integer> map = new HashMap<>();
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];
            // 如果不为空，证明找到了
            if (map.get(diff)!=null){
                // 下标
                result[0] = map.get(diff);
                result[1] = i;
                return result;
            }
            // key为值， value为下标
            // 这样就可以通过target-nums快速查找这个差值
            map.put(nums[i], i);
        }

        return null;
    }

    public static void main(String[] args) {
        TwoSum twoSum = new TwoSum();
        int[] nums = {4,7,1,22};
        int[] result = twoSum.twoSum(nums, 11);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}
