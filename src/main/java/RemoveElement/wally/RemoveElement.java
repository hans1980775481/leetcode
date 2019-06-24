package RemoveElement.wally;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wally
 * 这道题的空间空间复杂度为O1
 */
public class RemoveElement {
    public int removeElement(int[] nums,int val){
        List<Integer> list = new ArrayList<>();
        for (int num:nums){
            if (num != val){
                list.add(num);
            }
        }
        for (int i = 0; i < list.size(); i++){
            nums[i] = list.get(i);
        }
        return list.size();
    }
}
