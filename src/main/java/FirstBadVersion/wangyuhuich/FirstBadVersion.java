package FirstBadVersion.wangyuhuich;

/**
 * 你是产品经理，目前正在带领一个团队开发新的产品。不幸的是，你的产品的最新版本没有通过质量检测。由于每个版本都是基于之前的版本开发的，所以错误的版本之后的所有版本都是错的。
 * <p>
 * 假设你有 n 个版本 [1, 2, ..., n]，你想找出导致之后所有版本出错的第一个错误的版本。
 * <p>
 * 你可以通过调用 bool isBadVersion(version) 接口来判断版本号 version 是否在单元测试中出错。实现一个函数来查找第一个错误的版本。你应该尽量减少对调用 API 的次数。
 * <p>
 * 示例:
 * <p>
 * 给定 n = 5，并且 version = 4 是第一个错误的版本。
 * <p>
 * 调用 isBadVersion(3) -> false
 * 调用 isBadVersion(5) -> true
 * 调用 isBadVersion(4) -> true
 * <p>
 * 所以，4 是第一个错误的版本。 
 * <p>
 * 执行用时 :21 ms, 在所有 Java 提交中击败了22.07%的用户
 * 内存消耗 :34.1 MB, 在所有 Java 提交中击败了67.28%的用户
 */

public class FirstBadVersion {

    private static int first = 1702766719;

    public int firstBadVersion(int n) {
        if (n == 1) {
            return 1;
        }
        int start = 1;
        int end = n;
        int temp = end / 2 + start / 2;
        while (start < end) {
            if (isBadVersion(temp)) {
                if (!isBadVersion(temp - 1)) {
                    return temp;
                }
                end = temp;
            } else {
                start = temp;
            }
            if (temp == start) {
                start += 1;
            }
            temp = end / 2 + start / 2;
        }
        return start;
    }


    static boolean isBadVersion(int version) {
        if (version >= first) {
            return true;
        } else {
            return false;
        }
    }
}
