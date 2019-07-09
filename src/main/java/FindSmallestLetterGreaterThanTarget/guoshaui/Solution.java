package FindSmallestLetterGreaterThanTarget;

/**
 * @author Pluto
 * @date 2019年6月28日 下午3:11:18
 * @description
 */
public class Solution {	
	public char nextGreatestLetter(char[] letters, char target) {
        //判定letters的最后一个元素是否比target的值大，不是则返回第一个元素
        int leng = letters.length;
        if(letters[leng - 1] <= target){
            return letters[0];
        }
        
        /*创建两个指针指向数组letters的第0个元素和最后一个元素
        *计算l和r的中间数，只要中间位置的字母小于等于target的值将指针l指向mid+1
        *否则将指针r指向mid
        */
        int l = 0;
        int r = leng - 1;
        while(l < r){
            int mid = (r - l)/2 + l;
            if(letters[mid] <= target){
                l = mid + 1;
            }else{
                r = mid;
            }           
        }
        
        return letters[r];
    }
}