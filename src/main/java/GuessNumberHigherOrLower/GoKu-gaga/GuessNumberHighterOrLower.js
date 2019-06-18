/**
 * 翻译自 java 版本
 * 
 * public class Solution extends GuessGame {
      public int guessNumber(int n) {
          int l = 0, r = n;
          while(l <= r){
              int mid = l + (r-l)/2;
              switch(guess(mid)){
                  case 0: return mid;
                  case 1: l = mid+1; break;
                  case -1: r = mid-1; break;
              }
          }
          return -1;
      }
  }
*/

var Solution = function (n) {
    function guess (num) {
        return 0;
    }
    return function guessNumber(n) {
        let l = 0, r = n;
        while(l <= r){
            let mid = l + (r - l) / 2;
            switch(guess(mid)) {
                case 0:
                  return mid;
                case 1:
                  l = mid + 1;
                  break;
                case -1:
                  r = mid - 1;
                  break;
            }
        }
        return -1;
    }
}
