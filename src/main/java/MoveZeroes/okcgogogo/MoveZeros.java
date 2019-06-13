package MoveZeroes.okcgogogo;

import java.util.Arrays;

public class MoveZeros {
    public void moveZeroes(int[] nums) {
        int cur = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                int temp = nums[i];
                nums[i] = nums[cur];
                nums[cur] = temp;
                cur++;
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = {1,0,3,0,12,4,6};
        new MoveZeros().moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }
}
