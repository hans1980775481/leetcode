package TwoSum.XMHans;

import java.util.HashMap;

public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> numPos = new HashMap<>();
        HashMap<Integer, Integer> numSum = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (!numPos.containsKey(nums[i]))
                numPos.put(nums[i],i);
            if (numSum.containsKey(nums[i])) {
                numSum.put(nums[i],numSum.get(nums[i])+1);
            } else {
                numSum.put(nums[i],1);
            }
        }

        int[] result = new int[2];
        int x;
        for (int i = 0; i < nums.length; i++) {
            x = nums[i];
            if (numPos.containsKey(x) && numPos.containsKey(target-x)) {
                if (x == target-x) {
                    if (numSum.get(x) >= 2) {
                        result[0] = numPos.get(x);
                        for (int j = i+1; j < nums.length; j++) {
                            if (nums[j] == x) {
                                result[1] = j;
                                break;
                            }
                        }
                        break;
                    }
                } else {
                    result[0] = numPos.get(x);
                    result[1] = numPos.get(target-x);
                    break;
                }
            }
        }
        return result;
    }
}
