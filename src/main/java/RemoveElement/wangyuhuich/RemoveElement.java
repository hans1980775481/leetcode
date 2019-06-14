package RemoveElement.wangyuhuich;

/**
 * 思路:快速排序
 *
 * 结果:执行用时 : 1 ms, 在Remove Element的Java提交中击败了99.59% 的用户
 *     内存消耗 : 34.5 MB, 在Remove Element的Java提交中击败了95.75% 的用户
 */

public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int valCount = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val) {
                valCount++;
            }
        }
        int i = 0;
        int j = nums.length - 1;
        while (i < j) {
            while (nums[i] != val && i < j) {
                i++;
            }
            while (nums[j] == val && i < j) {
                j--;
            }
            nums[j] = nums[i] + (nums[i] = nums[j]) - nums[j];
        }
        return nums.length - valCount;
    }

    public static void main(String[] args) {
        int[] arr = {3, 2, 2, 3};
        new RemoveElement().removeElement(arr, 3);
    }
}