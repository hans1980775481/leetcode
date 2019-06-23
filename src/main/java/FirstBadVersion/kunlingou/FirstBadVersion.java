package FirstBadVersion.kunlingou;

import org.junit.Test;


/**
 * 二分查找
 * 使用位运算
 * @author kunlingou
 */
public class FirstBadVersion extends VersionControl {
	public int firstBadVersion(int n) {
		int low = 1, high = n, mid;
		while (low < high) {
			mid = (low + high) >>> 1;
			if (isBadVersion(mid))
				high = mid;
			else
				low = mid + 1;
		}
		return low;
	}

	@Test
	public void main() {
		firstBadVersion(3);
	}
}
