package RotateArray.LiuMinghao;

import sun.security.util.Length;

import java.util.Arrays;

public class RotateArray {
    public static void rotate(int[] nums, int k) {
        if (nums.length % 2 == 0 && k % 2 == 0) {
            int next;
            int index = 0;
            int pro = nums[0];
            for (int i = 0; i < nums.length / 2; i++) {
                next = nums[(index + k) % nums.length];
                nums[(index + k) % nums.length] = pro;
                pro = next;
                index += k;
                if (index >= nums.length) {
                    index -= nums.length;
                }
            }
            index = 1;
            pro = nums[1];
            for (int i = 0; i < nums.length / 2; i++) {
                next = nums[(index + k) % nums.length];
                nums[(index + k) % nums.length] = pro;
                pro = next;
                index += k;
                if (index >= nums.length) {
                    index -= nums.length;
                }
            }
        } else {
            int next;
            int index = 0;
            int pro = nums[0];
            for (int i = 0; i < nums.length; i++) {
                next = nums[(index + k) % nums.length];
                nums[(index + k) % nums.length] = pro;
                pro = next;
                index += k;
                if (index >= nums.length) {
                    index -= nums.length;
                }
            }
        }
    }



    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6};
        System.out.println(Arrays.toString(nums));
        rotate(nums, 2);
        System.out.println(Arrays.toString(nums));
    }
}
