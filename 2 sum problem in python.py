// 2 sum problem in python
def twoSum(self, nums: List[int], target: int) -> List[int]:
        n = len(nums)
        l = []
        if(n<=1):
            l.append(nums[0])
            l.append(nums[1])
            return l
        
        hm = {}
        for x in range(n):
            if len(hm)==0:
                hm[nums[x]]=x
            else:
                if target-nums[x] in hm:
                    return [hm[target-nums[x]],x]
                else:
                    hm[nums[x]] = x
        return l
