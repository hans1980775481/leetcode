class Solution {
    public List<String> generateParenthesis(int n) {
        if(n==0){
            return new ArrayList<>();
        }
        else {
            String s;
            List<String> list = new ArrayList<>();
            List<String> leftlist, rightlist;
            if(n==1){
                s="()";
                list.add(s);
            }
            else {
                for (String it:generateParenthesis(n-1)) {
                    s = "(" + it + ")";
                    if (!list.contains(s))
                        list.add(s);
                }
                for(int i=n-1;i>0;i--){
                    leftlist = generateParenthesis(i);
                    rightlist = generateParenthesis(n-i);
                    for(String it1:leftlist){
                        for(String it2:rightlist){
                            s = it1+it2;
                            if(!list.contains(s)){
                                list.add(s);
                            }
                        }
                    }
                }
            }
            return list;
        }
    }
}
