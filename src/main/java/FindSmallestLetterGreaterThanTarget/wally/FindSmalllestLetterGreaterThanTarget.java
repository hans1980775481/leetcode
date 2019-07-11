package FindSmallestLetterGreaterThanTarget.wally;

/**
 * @author wally
 */
public class FindSmalllestLetterGreaterThanTarget {
    public char nextGreatestLetter(char[] letters, char target){

        if (target >= letters[letters.length - 1]){
            return letters[0];
        }
        for (char ch : letters){
            if (target < ch){
                return ch;
            }
        }
        return target;
    }
}
