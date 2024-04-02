class Solution {
    public List<String> generateParenthesis(int n) {
        List<String>l = new LinkedList<>();
        function(l,0,0,"",n);
        return l;
    }

    public void function(List<String>l, int left, int right, String s, int n){
        if(s.length() == n*2){
            l.add(s);
            return;
        }

        if(left < n) function(l,left+1,right,s+"(",n);
        if(right < left) function(l,left,right+1,s+")",n);
    }
}
