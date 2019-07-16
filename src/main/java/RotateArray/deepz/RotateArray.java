package RotateArray.deepz;

/**
 * @author deepsleeping
 * @date 2019/7/16 09:52
 * @description 旋转数组
 */
public class RotateArray {

    public void rotate(int[] nums, int k) {
        int[] result = new int[nums.length];

        int len = nums.length;
        for (int i = 0; i < len; i++) {
            int index = (i + k) % len;
            result[index] = nums[i];
        }
        for (int i = 0; i < len; i++) {
            nums[i] = result[i];
        }


    }
}
