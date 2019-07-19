def twoSum(self, nums: List[int], target: int) -> List[int]:
        mp = {}
        for i, val in enumerate(nums):
            if target-val in mp.keys():
                return [mp[target-val],i]
            else:
                mp[val] = i
        return
