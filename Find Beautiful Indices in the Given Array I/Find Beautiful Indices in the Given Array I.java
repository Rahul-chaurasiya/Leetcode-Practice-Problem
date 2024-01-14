class Solution {
    public List<Integer> beautifulIndices(String s, String a, String b, int k) {
        List<Integer>ans = new ArrayList<>();
        List<Integer>a_in = new ArrayList<>();
        List<Integer>b_in = new ArrayList<>();
        int n = s.length();
        
        for(int i=0;i<=n-a.length();i++){
            if(isornot(i,i+a.length(),s,a)) a_in.add(i);
        }
        
        for(int i=0;i<=n-b.length();i++){
            if(isornot(i,i+b.length(),s,b)) b_in.add(i);
        }
        
        for(int i:a_in){
            for(int y:b_in){
                if(inorout(i,y,k)){ 
                    ans.add(i);
                    break;
                }
            }
        }
        
        return ans;
    }
    
    public boolean isornot(int start,int end,String s,String temp){
        if(s.substring(start,end).equals(temp)) return true;
        else return false;
    }
    
    public boolean inorout(int i,int j,int k){
        if(Math.abs(i-j)<=k) return true;
        else return false;
    }
}
