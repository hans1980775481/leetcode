package GuessNumberHigherOrLower374;
/*
 *  执行用时 :0 ms, 在所有 Java 提交中击败了100.00%的用户
	内存消耗 :33 MB, 在所有 Java 提交中击败了67.42%的用户
 */

public class Solution extends GuessGame {
	public int guessNumber(int n) {
		int low = 1, high = n;
		while (low <= high) {
			int mid = low + (high - low) / 2;
			int res = guess(mid);
			if (res != 0) {
				if (res == -1) {
					high = mid - 1;
				} else {
					low = mid + 1;
				}
			} else {
				return mid;
			}
		}
		return 0;
	}

}