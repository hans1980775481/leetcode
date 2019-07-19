/**
 * @param {number[]} nums
 * @param {number} k
 * @return {void} Do not return anything, modify nums in-place instead.
 */
var rotate = function(nums, k) {
  nums.unshift(...nums.splice(-k % nums.length));
};

/** 
 * 执行结果
 * 执行用时 : 112 ms, 在 JavaScript 提交中击败了 70.27% 的用户
 * 内存消耗 : 35.2 MB, 在 JavaScript 提交中击败了 62.11% 的用户
*/