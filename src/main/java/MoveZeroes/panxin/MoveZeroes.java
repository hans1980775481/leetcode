package MoveZeroes.panxin;

public class MoveZeroes {

    public static void main(String[] args) {
        int[] nums = new int[]{0,1,0,3,12};
        new MoveZeroes().moveZeroes(nums);
        for (int num : nums) {
            System.out.println(num);
        }
    }

    public void moveZeroes(int[] nums) {
        int notZeroIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[notZeroIndex] = nums[i];
                notZeroIndex ++;
            }
        }

        for (int i = notZeroIndex; i < nums.length; i++) {
            nums[i] = 0;
        }
    }


}
