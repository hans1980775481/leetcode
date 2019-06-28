class Solution:
    def checkValidString(self, s: str) -> bool:
        stack = ""
        for i in s:
            if i == "(" or i == "*":
                stack += i
            else:
                if stack == "":
                    return False
                elif "(" in stack:
                    index = stack.rfind("(")
                    stack = stack[:index] + stack[index + 1 : len(stack)]
                else:
                    stack = stack[:-1]
        
        index = stack.find("(")
        stack = stack[index:]
        stack1 = ""
        print(stack)
        for i in stack:
            if i == "(":
                stack1 += i
            else:
                stack1 = stack1[:-1]
        print(stack1)
        if "(" in stack1:
            return False
        else:
            return True
