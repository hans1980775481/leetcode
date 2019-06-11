package MoveZeroes.wangwangyuwan;

import java.util.Arrays;

public class MoveZeroes {
    public int[] movezeroes(int[] nums){
        int index = 0;
        for(int i=0;i<nums.length;i++){
            if(0 != nums[i]){
                int temp = nums[i];
                nums[i] = nums[index];
                nums[index] = temp;
                ++ index;
            }
        }
        return nums;
    }
}
