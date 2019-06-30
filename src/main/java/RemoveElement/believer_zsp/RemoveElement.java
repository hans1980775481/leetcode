package sxu.java.leetcode;

public class RemoveElement {
    /** Given nums = [3,2,2,3], val = 3,
     *  output 2
     *
     *  Given nums = [0,1,2,2,3,0,4,2], val = 2,
     *  output 5
     */


    /**去除数组中的目标元素，使用原地排序算法。
     *
     * @param nums
     * @param val
     * @return
     */
    public int removeElement(int[] nums, int val) {
        int len = nums.length;
        //所去除元素的个数
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val) {
                ++count;
                continue;
            }
            nums[i - count] = nums[i];
        }
        return len - count;
    }

}
