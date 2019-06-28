package sxu.java.leetcode;

public class MoveZeroes {
    //Input: [0,1,0,3,12] Output: [1,3,12,0,0]
    //要求使用稳定排序和原地排序


    public static void main(String[] args) {
        MoveZeroes m = new MoveZeroes();
        int [] a= {0,1,0,3,12};
        m.moveZeroes(a);
        for (int s : a) {
            System.out.println(s);
        }
        System.out.println(a);
    }

    /**
     * 思想是使用插入排序，并且把0看做比所有数都大的数字，排序时直接放到最后。
     * @param nums
     */
/*

    public void moveZeroes(int[] nums) {
        //i下标代表待排序数，j下标代表比较数字
        for (int i = 1; i < nums.length; i++) {
            int j = i - 1;
            //temp是待排序数字
            int temp = nums[i];
            //当待排序的数为0时，直接进入下次排序
            if (nums[j + 1] == 0) {
                continue;
            }
            for (; j >= 0; j--) {
                //排序时遇见0就移动，或者当待排序数小时移动比较数字
                if (nums[j] == 0 || temp < nums[j]) {
                    nums[j + 1] = nums[j];
                } else {
                    break;
                }
            }
            nums[j + 1] = temp;
        }
    }
*/

    public void moveZeroes(int[] nums){
        int index = nums.length - 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] == 0) {
                int temp = nums[i];
                //移动操作
                for (int j = i; j < index; j++) {
                    nums[j] = nums[j + 1];
                }
                nums[index--] = temp;
            }

        }


    }


}
