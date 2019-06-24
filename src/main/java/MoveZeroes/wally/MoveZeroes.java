package MoveZeroes.wally;


import java.util.ArrayList;
import java.util.List;

/**
 * @author wally
 */
public class MoveZeroes {
    public static void main(String[] args){
        moveZeroes(new int[]{0,1,0,3,12});
    }
    public static void moveZeroes(int[] nums){
        int countZeroes = 0;
        for (int i = 0; i < nums.length; i++){
            if (nums[i] == 0){
                countZeroes+= 1;
            }
        }
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++){
            if (nums[i] != 0){
                list.add(nums[i]);
            }
        }
       for (int i = 0; i < countZeroes; i++){
           list.add(0);
       }
       for (int i = 0; i < nums.length; i++){
           nums[i] = list.get(i);
       }
       for (int num:nums){
           System.out.print(num+" ");
       }
    }
}
