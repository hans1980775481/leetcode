package RemoveElement.wangwangyuwan;

public class RemoveElement {

    public int removeElement(int[] nums, int val) {

        int count = 0;
        for(int i=0,index=0;i<nums.length;i++){
            if(val != nums[i]){
                int temp = nums[i];
                nums[i] = nums[index];
                nums[index++] = temp;
            }else{
                ++ count;
            }

        }
        return nums.length-count;
    }
}
