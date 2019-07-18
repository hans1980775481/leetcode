package TwoSum.maliyuan;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
        for(int i = 0; i<nums.length;i++){
            int temp = target - nums[i];
            if (hashMap.containsKey(temp)){
                return new int[]{i,hashMap.get(temp)};
            }
            hashMap.put(nums[i],i);
        }
        return null;
    }
}
