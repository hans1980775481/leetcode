package FindSmallestLetterGreaterThanTarget.weiyien;

/**
 * @auther: 魏薏恩
 * @date: 2019/6/25 09:26
 * @description:
 */
public class FindSmallestLetterGreaterThanTarget {
    public static char nextGreatestLetter(char[] letters, char target) {
        int left = 0;
        int right = letters.length;
        int mid = 0;
        while (left != right) {
            mid = left + ((right - left) >> 1);
            if (letters[mid] == target) {
                int i = 0;
                for (i = mid; i < right; i++) {
                    if (letters[i] > target) {
                        return letters[i];
                    }
                }
                if (i == right) {
                    if (right == letters.length) {
                        return letters[0];
                    } else {
                        return letters[i];
                    }
                }
            } else if (letters[mid] < target) {
                left = mid + 1;
            } else {
//                 char[mid]>target
                if (mid == 0) {
                    return letters[mid];
                } else {
                    if (letters[(mid - 1) % letters.length] <= target) {
                        return letters[mid];
                    } else {
                        right = mid;
                    }
                }
            }
        }
        return letters[0];
    }

    public static void main(String[] args) {
        char[] letters = new char[]{'c', 'f', 'j'};
        System.out.println(nextGreatestLetter(letters, 'k'));
    }

}
