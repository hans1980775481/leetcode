package FindSmallestLetterGreaterThanTarget.ZHANGJIKAI5;

/**
 * author：ZHANGJIKAI5
 * 题目：744. Find Smallest Letter Greater Than Target
 * 解题思路：二分法遍历数组，和target进行比较，得到比target大的最小值，若循环结束未得到值，则直接获取letters[0]
 */
public class FindSmallestLetterGreaterThanTarget {

    /**
     * 第二次执行（降低时间复杂度的关键是，无需创建Charter再获取hashcode进行比较，int和char可以直接进行比较（在int不超过char的数据范围时））：
     * Runtime: 0 ms, faster than 100.00% of Java online submissions for Find Smallest Letter Greater Than Target.
     * Memory Usage: 37.8 MB, less than 100.00% of Java online submissions for Find Smallest Letter Greater Than Target.
     */
    public char nextGreatestLetter(char[] letters, char target) {
        // 此处数组是有序的，所以无需排序

        // 二分查找
        Character c = getChar(letters, target);
        // 到遍历到最后都没有得到比target大的，代表该letters中没有比target大的字符，此处，取letters[0]即可
        if (c == null) {
            c = letters[0];
        }
        // 因为letters是肯定包含两个以上元素的，此处c最终肯定有值，所以没有进行非空判断
        return c;
    }

    private Character getChar(char[] letters, char target) {
        Character c = null;
        int left = 0;
        int right = letters.length;
        while (left < right) {
            int mid = (left+right)/2;
            // 此处为优化的关键，char和int可以直接（强转）进而比较大小
            if (letters[mid]> target) {
                c = letters[mid];
                right = (left+right)/2;
            } else {
                left = (left+right)/2 + 1;
            }
        }
        return c;
    }

    /**
     * 第一次执行（时间复杂度太高）：
     * 思路：使用hashcode获取ASCII值进行比较，第一次循环若没找到，则将target的ASCII值-26，再次循环
     * Runtime: 1 ms, faster than 23.95% of Java online submissions for Find Smallest Letter Greater Than Target.
     * Memory Usage: 38.4 MB, less than 99.92% of Java online submissions for Find Smallest Letter Greater Than Target.
     */
    /*public char nextGreatestLetter(char[] letters, char target) {
        Character tar = new Character(target);
        // 此处数组是有序的，所以无需排序

        // 二分查找
        Character c = getChar(letters, tar.hashCode());
        if (c == null) {
            c = letters[0];
        }
        // 因为letters是肯定包含两个以上元素的，此处c最终肯定有值，所以没有进行非空判断
        return c.charValue();
    }

    private Character getChar(char[] letters, int target) {
        Character c = null;
        int left = 0;
        int right = letters.length;
        while (left < right) {
            int mid = (left+right)/2;
            if (new Character(letters[mid]).hashCode() > target) {
                c = letters[mid];
                right = (left+right)/2;
            } else {
                left = (left+right)/2 + 1;
            }
        }
        return c;
    }*/

    public static void main(String[] args) {
        char[] letters = {'c', 'f', 'j'};
        char target = 'k';
        FindSmallestLetterGreaterThanTarget findSmallestLetterGreaterThanTarget = new FindSmallestLetterGreaterThanTarget();
        System.out.println(findSmallestLetterGreaterThanTarget.nextGreatestLetter(letters, target));

    }
}
