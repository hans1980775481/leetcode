package FindSmallestLetterGreaterThanTarget.graceBaoXP;

/**
 * Given a list of sorted characters letters containing only lowercase letters,
 * and given a target letter target, find the smallest element in the list that is larger than the given target.
 *
 * Letters also wrap around. For example, if the target is target = 'z' and letters = ['a', 'b'], the answer is 'a'.
 */
public class FindSmallerLetterGreaterThanTarget {
    public char nextGreatestLetter(char[] letters, char target) {
        int low=0,high=letters.length;

        while (low<high){
            int min=low+(high-low)/2;
            if(letters[min]<=target){
                low=min+1;
            }else {
                high=min;
            }
        }
        return letters[low%letters.length];
    }
}
