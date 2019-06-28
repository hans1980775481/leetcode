package FindSmallestLetterGreaterThanTarget.wangyuhuich;

import java.util.HashMap;
import java.util.Map;
/**
 * 给定一个只包含小写字母的有序数组letters 和一个目标字母 target，寻找有序数组里面比目标字母大的最小字母。
 * <p>
 * 数组里字母的顺序是循环的。举个例子，如果目标字母target = 'z' 并且有序数组为 letters = ['a', 'b']，则答案返回 'a'。
 * <p>
 * 示例:
 * <p>
 * 输入:
 * letters = ['c', 'f', 'j']
 * target = 'a'
 * 输出: 'c'
 * <p>
 * 输入:
 * letters = ['c', 'f', 'j']
 * target = 'c'
 * 输出: 'f'
 * <p>
 * 执行用时 :5 ms, 在所有 Java 提交中击败了12.35%的用户
 * 内存消耗 :43.7 MB, 在所有 Java 提交中击败了73.12%的用户
 */
public class FindSmallestLetterGreaterThanTarget {
    public char nextGreatestLetter(char[] letters, char target) {
        Map<Character, Integer> map = new HashMap<>(letters.length);
        for (int i = 0; i < letters.length; i++) {
            map.put(letters[i], i);
        }
        for (int j = 0; j < 26; j++) {
            target++;
            if (target > 122) {
                target = 97;
            }
            if (map.get(target)!=null) {
                return letters[map.get(target)];
            }

        }
        return 0;
    }
}
