package GuessNumberHigherOrLower.kunlingou;

import org.junit.Test;

public class GuessNumberHigherOrLower extends GuessGame {
	public int guessNumber(int n) {
		int l=1,r=n;
		while(l<r) {
			int m = (l+r)>>>1;
			switch(guess(m)) {
			case 1:
				l = m + 1;
				break;
			case -1:
				r = m - 1;
				break;
			default:
				l = r = m;
			}
		}
		return l;
	}
	
	@Test
	public void Test() {
		guessNumber(10);
	}
}

class GuessGame {
	int guess(int num) {
		int re = num - 6;
		return re == 0 ? 0:re>0?-1:1;
	}
}
