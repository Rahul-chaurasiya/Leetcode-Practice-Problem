class Solution {
    public int minimumPushes(String word) {
        HashMap<Character,Integer>hm = new HashMap<>();
        for(char ch:word.toCharArray()){
            hm.put(ch,hm.getOrDefault(ch,0)+1);
        }
        
        List<Integer> l = new ArrayList<>(hm.values());
        Collections.sort(l, Comparator.reverseOrder());
        
        int ans=0;
        for(int i=0;i<l.size();i++){
            if(i>=0&&i<=7) ans+= l.get(i);
            else if(i>=8&&i<=15) ans += (l.get(i)*2);
            else if(i>=16&&i<=23) ans+= (l.get(i)*3);
            else ans+= (l.get(i)*4);
        }
        return ans;
    }
}
