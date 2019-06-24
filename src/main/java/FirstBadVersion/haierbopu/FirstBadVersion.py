# The isBadVersion API is already defined for you.
# @param version, an integer
# @return a bool
# def isBadVersion(version):

class Solution:
    def firstBadVersion(self, n):
        """
        :type n: int
        :rtype: int
        """
        
        #create two pointer, one from left, one from right
        l = 1
        r = n
        
        #the condition requires the left pointer is always smaller than the right one, when condition is not met, the l values is the answer
        while l < r:
            #calculate the mid value between left and right pointer
            temp = (r-l)//2 + l 
            #if the mid value is bad version, which means mid value is bigger or equal to the first bad version'index, so we decrease right pointer by move it to the mid
            if isBadVersion(temp): 
                r = temp
            #if the mid value is not bad version, which means mid value is smaller than the first bad version's index, so we move the left pointer to the mid plus one
            else:
                l = temp + 1
        #return the left pointer as the result
        return l
