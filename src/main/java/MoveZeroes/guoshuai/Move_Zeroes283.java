package test;
public class Move_Zeroes283 {
	public void moveZeroes(int[] nums) {
		int j = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != 0) {
				nums[j] = nums[i];
				j++;
			}
		}
		while (j < nums.length) {
			nums[j] = 0;
			j++;
		}
	}
	public static void main(String[] args) {
		int[] nums = new int[] {0,1,0,3,12};
		Move_Zeroes283 mz=new Move_Zeroes283();
		mz.moveZeroes(nums);
		for(int i=0;i<nums.length;i++) {
			System.out.println(nums[i]+" ");
		}
	}

}