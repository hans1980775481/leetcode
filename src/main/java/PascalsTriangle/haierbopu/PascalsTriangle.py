def generate(self, numRows: int) -> List[List[int]]:
    if numRows == 0:
        return []
    ans = [[1]]
    for i in range(1, numRows):
        temp = [0] + ans[-1] + [0]
        for j in range(len(temp)-1):
            temp[j] = temp[j] + temp[j+1]
        ans.append(temp[:-1])
    return ans
                
