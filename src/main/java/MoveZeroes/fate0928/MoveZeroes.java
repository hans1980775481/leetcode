package MoveZeroes.fate0928;

public class MoveZeroes {

	public void moveZeroes(int[] nums) {
		for(int i=0; i<nums.length;i++){
			//��ȡΪ0���±�
			if(nums[i]==0)
			{
				int k = i;
				for(int j=i+1;j<nums.length;j++){
					if(nums[j]!=0){
						int a = nums[j];
						nums[j] = nums[k];
						nums[k] = a;
						k=j;
					}
				}
			}
		}
	}

}
