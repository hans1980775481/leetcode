/**
 * Definition for isBadVersion()
 * 
 * @param {integer} version number
 * @return {boolean} whether the version is bad
 * isBadVersion = function(version) {
 *     ...
 * };
 */

/**
 * @param {function} isBadVersion()
 * @return {function}
 */
var solution = function(isBadVersion) {
  /**
   * @param {integer} n Total versions
   * @return {integer} The first bad version
   */
  return function(n) {
      if (n <= 0) {
          return 0;
      }
      let left = 0;
      let right = n;
      while(left < right) {
          let mid = Math.floor(left + (right - left) / 2);
          if (isBadVersion(mid)) {
              if (!isBadVersion(mid - 1)) {
                  return mid;
              } else {
                  right = mid - 1;
              }
          } else {
              left = mid + 1;
          }
      }
      return left;
  };
};

/**
 * 执行用时 : 60 ms, 在所有JavaScript提交中击败了99.68%的用户
 * 内存消耗 :34.1 MB, 在所有JavaScript提交中击败了5.45%的用户
 */