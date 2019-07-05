class Solution:
    def generateParenthesis(self, n: int

    ) -> List[str]:
    res = []
    self.generate(n, n, '', res)
    return res


def generate(self, left, right, str_p, res):
    if left == 0 and right == 0:
        res.append(str_p)
        return

    if left > 0:
        self.generate(left - 1, right, str_p + '(', res)

    if right > left:  ### 此处是left > right   #if right > 0:
        self.generate(left, right - 1, str_p + ')', res)