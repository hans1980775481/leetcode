package RotateArray.cpsky;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author: sky
 * @Date: 2019/7/20
 * @Description:
 */
public class Solution {
    public static void main(String[] args) {
        int[] a = new int[] {1};
        int k = 1;
        rotate(a,k);
    }
    public static void rotate(int[] nums, int k) {
        //实际移动次数,防止原地转圈
        k = k % nums.length;
        List tmp = new ArrayList();
        for (int i = nums.length - k; i < nums.length; i ++) {
            tmp.add(nums[i]);
        }
        for (int i = nums.length - k - 1; i >= 0; i --) {
            nums[i + k] = nums[i];
        }
        for(int i = 0; i < k; i ++) {
            nums[i] = (int)tmp.get(i);
        }
    }
}