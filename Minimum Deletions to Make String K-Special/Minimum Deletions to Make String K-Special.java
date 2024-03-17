class Solution {
    public int minimumDeletions(String word, int k) {
        Map<Character,Integer>mp = new HashMap<>();
        List<Integer>l = new ArrayList<>();
        for(char ch:word.toCharArray()){
            mp.put(ch,mp.getOrDefault(ch,0)+1);
        }
        
        for(int x:mp.values()){
            l.add(x);
        }
        
        Collections.sort(l,Collections.reverseOrder());
        int min = Integer.MAX_VALUE;
        for(int i=0;i<l.size();i++){
            int x = l.get(i);
            int dl = 0;
            for(int li:l){
                dl = func(li,x,k,dl);
            }
            min = func2(dl,min);
            if(min == 0) break;
        }
        return func3(min);
    }
    
    private int func(int f,int target,int k,int del){
        if (f > target + k) del += f - (target + k);
        else if (f < target) del += f;
        return del;
    }
    
    private int func2(int x,int y){
        return Math.min(x,y);
    }
    
    private int func3(int x){
        if(x != Integer.MAX_VALUE) return x;
        else return 0;
    }
}
