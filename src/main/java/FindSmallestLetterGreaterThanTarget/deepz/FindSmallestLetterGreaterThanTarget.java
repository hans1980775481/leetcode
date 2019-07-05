package FindSmallestLetterGreaterThanTarget.deepz;

import java.util.Arrays;

/**
 * @author DeepSleeping
 * @date 2019/7/2 22:06
 * @description 寻找比目标字母大的最小字母
 */
public class FindSmallestLetterGreaterThanTarget {

    public char nextGreatestLetter(char[] letters, char target) {


        Arrays.sort(letters);
        int left = 0;
        int right = letters.length - 1;
        while (left < right){
            int mid = left + (right - left) / 2;
            if (letters[mid] > target){
                right = mid;
            }else{
                left = mid + 1;
            }
        }

        //因为题目中展示的第一个案例表明如果整个letters数组没有比target大的字母，则返回数组中第一个字母
        return  left < letters.length ? letters[left] : letters[0];
    }
}
