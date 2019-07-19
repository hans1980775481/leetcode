/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number[]}
 */
var twoSum = function (nums, target) {
  const length = nums.length;
  const hash = new Map();
  nums.forEach(function (val, index) {
    hash.set(val, index);
  })
  let numToFind;
  for (let index = 0; index < length; index++) {
    numToFind = target - nums[index];
    if (hash.has(numToFind) && index !== hash.get(numToFind)) {
      return [index, hash.get(numToFind)];
    }
  }
};

/** 
 * 执行结果
 * 执行用时 : 84 ms, 在 JavaScript 提交中击败了 89.28% 的用户
 * 内存消耗 : 35.7 MB, 在 JavaScript 提交中击败了 14.27% 的用户
*/
