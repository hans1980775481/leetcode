package RemoveElement.Dagon0577;

/**
 * @author Dagon0577
 * @date 2019/6/12 18:00
 */
public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int index = 0;
        int valIndex = 0;
        while(valIndex < nums.length){
            while(valIndex < nums.length && nums[valIndex] == val){
                valIndex++;
            }
            if(valIndex < nums.length){
                nums[index++] = nums[valIndex++];
            }
        }
        return index;
    }
}
