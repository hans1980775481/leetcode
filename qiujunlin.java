class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<>();
        backtrack(list,"",0,0,n); 
        return list;
    }
    private void backtrack(List<String> list, String temp,int left,int right,int n){ 
        if(left>n || right > left || right > n){ 
            return; 
        } 
        if(left ==n && right == n){ 
            list.add(temp.toString()); 
            return; 
        } 
        backtrack(list,temp+"(",left+1,right,n);
        backtrack(list,temp+")",left,right+1,n);
    } 
}