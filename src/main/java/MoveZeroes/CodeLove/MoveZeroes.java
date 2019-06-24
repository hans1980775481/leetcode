package MoveZeroes.CodeLove;

public class MoveZeroes {
    public void moveZeros(int[] nums){
        for (int i = 0, cur = 0; i< nums.length; i++) {
            if (nums[i] !=0) {
                int swap = nums[i];
                nums[i] = nums[cur];
                nums[cur++] = swap;
            }
        }
    }
}
