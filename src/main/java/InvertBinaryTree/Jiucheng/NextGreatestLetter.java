package InvertBinaryTree.Jiucheng;

public class NextGreatestLetter {
    public char nextGreatestLetter(char[] letters, char target) {
        int mis = 0;
        int low = 0;
        int height = letters.length;
        while (low < height) {
            mis = (height + low) / 2;
            if (letters[mis] > target) {
                height = mis;
            } else {
                low = mis + 1;
            }
        }
        return letters[low % letters.length];
    }

}
