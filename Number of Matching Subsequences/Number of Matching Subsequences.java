class Solution {
    public int numMatchingSubseq(String s, String[] word) {
        HashMap<String,Integer> hp = new HashMap<>();
        for(var a : word){
            hp.put(a,hp.getOrDefault(a,0)+1);
        }

        int ans = 0;    
        for(var a : hp.keySet()){
            int i=0;
            int j=0;

            while(i<s.length() && j<a.length()){
                if(s.charAt(i)==a.charAt(j)){
                    i++;
                    j++;
                }else{
                    i++;
                }
            }
            if(j==a.length()) ans+=hp.get(a);
        }
        return ans;
    }
}
