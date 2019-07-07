class Solution {
    public int removeElement(int[] nums, int val) {
        int len = 0;
        for(int n=0;n<nums.length;n++){
            if(nums[n] == val){
                len++;
            }
        }
        if(len==0){
            return nums.length-len;
        }
        int j = nums.length-len;
        for(int i=0;i<=nums.length-len;i++){
            if(nums[i]==val){
                for(;j<nums.length;j++){
                    if(nums[j]!=val){
                        nums[i]=nums[j++];
                        break;
                    }
                    
                }
            }
        }
  return nums.length-len;
    }
}