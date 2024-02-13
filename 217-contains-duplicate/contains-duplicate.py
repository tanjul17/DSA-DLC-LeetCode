class Solution:
    def containsDuplicate(self, nums: List[int]) -> bool:
        hs = set()
        for i in nums:
            if i in hs:
                return True
            hs.add(i)
        return False
        