class Solution {
    public int leastInterval(char[] tasks, int n) {
        if(n==0) return tasks.length;
        int c=0,max=Integer.MIN_VALUE;
        Map<Character,Integer>hm = new HashMap<>();
        for(char ch:tasks){
            hm.put(ch,hm.getOrDefault(ch,0)+1);
        }

        for(Map.Entry<Character,Integer>e:hm.entrySet())
            max=(int)Math.max(max,e.getValue());

        for(Map.Entry<Character,Integer>e:hm.entrySet())
            if(e.getValue()==max)c+=1;
        
        return (int)Math.max(((max-1)*(n+1))+c,tasks.length);
    }
}
