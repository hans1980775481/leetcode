package RemoveElement.weichong0325;

/**
 * Create by weichong0325 on 2019/6/11
 * leetcode-27:移除元素
 * 解题思路：
 * 使用双指针，从前向后进行遍历，i为慢指针，j为快指针
 * 当nums[j]与指定值不相等时，将值赋给到i位置，且i自增
 */
public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int i = 0;
        for (int j = 0; j <nums.length ; j++) {
            if (nums[j]!=val){
                nums[i] = nums[j];
                i++;
            }
        }
        return  i;
    }
}
/*
执行用时 :1 ms, 在所有Java提交中击败了99.52%的用户
内存消耗 :34.4 MB, 在所有Java提交中击败了97.02%的用户
 */