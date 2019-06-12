package MoveZeroes.Dagon0577;

/**
 * @author Dagon0577
 * @date 2019/6/12 17:59
 */
public class MoveZeroes {
    public void moveZeroes(int[] nums) {
        if (nums.length == 1 || nums == null)
            return;
        int j = 0;
        for (int i = 0; i < nums.length; i++)
            if (nums[i] != 0) {
                int tmp = nums[i];
                nums[i] = nums[j];
                nums[j] = tmp;
                j++;
            }
    }
}
