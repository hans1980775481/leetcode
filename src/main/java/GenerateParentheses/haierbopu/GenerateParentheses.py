class Solution:
    def generateParenthesis(self, n):
        
        def generate(p, l, r, result):
            if l > 0:         
                generate(p + '(', l-1, r, result)
            if r > l: 
                generate(p + ')', l, r-1, result)
            if r == 0:    
                result += [p]
            return result
        return generate('', n, n, [])
