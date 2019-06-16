package RemoveElement.guoshuai;
/*
 * 2019/5/30
 * 27.Remove Element
 * 解题思路：在最近考研复习的数据结构中刚好做过
 * 			创建两个变量，一个用来挨个判断传入参数中nums数组的每个值是否等于传入参数中的val，
 * 			另外一个用来当做新数组的下标。
 */
class Remove_Element27 {
	public int removeElement(int[] nums, int val) {
		int i = 0;
		for (int j = 0; j < nums.length; j++) {
			if (nums[j] != val) {
				nums[i] = nums[j];
				i++;
			}
		}
		return i;

	}

	public static void main(String[] args) {
		int[] nums = new int[] { 0, 1, 2, 2, 3, 0, 4, 2 };
		Remove_Element27 re = new Remove_Element27();
		System.out.println(re.removeElement(nums, 2));

	}

}