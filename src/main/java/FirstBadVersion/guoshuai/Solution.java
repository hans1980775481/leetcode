package FirstBadVersion;
/*
 *  执行用时 :16 ms, 在所有 Java 提交中击败了95.22%的用户
	内存消耗 :34.2 MB, 在所有 Java 提交中击败了66.36%的用户
 */

public class Solution extends VersionControl {
	

	public int firstBadVersion(int n) {
		int low = 1;
		int high = n;
		// (low+high)/2 可能会越界
		while (low < high) {
			int mid = low + (high - low) / 2;
			if (isBadVersion(mid)) {
				high = mid;
			} else {
				low = ++mid;
			}
		}
		return low;
	}

}