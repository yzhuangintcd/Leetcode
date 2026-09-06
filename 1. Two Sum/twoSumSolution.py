from typing import List


class twoSumSolution:
    def twoSum(self, nums: List[int], target: int ) -> List[int]:
        prevMap = {} # val : index
        
        # i = index, n = number
        for i, n in enumerate(nums):
            diff = target - n
            
            if diff in prevMap:
                return [prevMap[diff], i]
            
            prevMap[n] = i
        return
    
solution = twoSumSolution()

assert solution.twoSum([2, 7, 11, 15], 9) == [0, 1]
assert solution.twoSum([3, 2, 4], 6) == [1, 2]
assert solution.twoSum([3, 3], 6) == [0, 1]
assert solution.twoSum([1, 2, 3], 10) is None