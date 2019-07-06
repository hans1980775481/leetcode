package FindSmallestLetterGreaterThanTarget.AzusaMutan;

public class FindSmallestLetterGreaterThanTarget {
    public static void main(String[] args) {
        class Solution {
            public char nextGreatestLetter(char[] letters, char target) {
                if (target >= letters[letters.length-1]) return letters[0];
                else if (target < letters[0]) return letters[0];
                else return f(letters,target,0,letters.length-1);
            }

            public char f (char[] letters, char target, int begin, int end) {
                if (begin == end || begin+1 == end) {
                    if (letters[begin] == target && begin != letters.length-1) {
                        while(letters[begin] == target) {
                            begin++;
                        }
                        return letters[begin];
                    }
                    if (letters[begin] < target) return letters[begin+1];
                    else return letters[begin];
                }
                int mid = end + (begin-end) / 2;
                if (letters[mid] == target) {
                    return f(letters,target,mid,end);
                }
                else if (letters[mid] < target) {
                    return f(letters,target,mid,end);
                }
                else return f(letters,target,begin,mid);
            }
        }

        char[] letters = {'e','e','e','e','e','e','n','n','n','n'};
        Solution solution = new Solution();
        System.out.println(solution.nextGreatestLetter(letters,'e'));
    }
}
