class Solution:
    def isValid(self, s: str) -> bool:
        '''
        使用栈解决本题：
        1.先制作三种括号对应的映射
        2.将左括号添加到栈中，当遇到右括号时，将其与此时的栈顶元素相比较-->同：则此括号对应；不同：则括号不对应
        3.如果第一个元素是反括号-->false
        4.如果遍历完成，stack不为空，证明还有没有匹配的括号-->返回false
        '''
        if len(s) % 2 != 0:
            return False
        stack = []
        match = {'(': ')', '[': ']', '{': '}'}
        for i in s:
            if i == '(' or i == '[' or i == '{':
                stack.append(i)
            else:
                if len(stack) == 0:  # 防止第一个字符是反括号，如果没有这句，pop不能对空字符进行操作
                    return False
                top = stack.pop()
                if match[top] != i:
                    return False

        if len(stack) != 0:
            return False

        return True




