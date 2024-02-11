class Solution {
    public int maxPalindromesAfterOperations(String[] words) {
        List<Integer>l = new ArrayList<>();
        HashMap<Character,Integer>hm = new HashMap<>();
        
        for(String s:words){
            int x = aadha(s.length());
            l.add(x);
            for(char ch:s.toCharArray()){
                hm.put(ch,hm.getOrDefault(ch,0)+1);
            }
        }
        
        int thp = function(hm);
        Collections.sort(l);
        
        for (Map.Entry<Character, Integer> entry : hm.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        
        int ans = 0;
        for(int x:l){
            thp-=x;
            if(thp <0)return ans;
            else ans++;
        }
        
        return l.size();
    }
    
    private int aadha(int x){
        return x/2;
    }
    
    private int function(Map<Character, Integer>hm){
        int ans = 0;
        for(int x:hm.values()){
            ans += x/2;
        }
        return ans;
    }
}
