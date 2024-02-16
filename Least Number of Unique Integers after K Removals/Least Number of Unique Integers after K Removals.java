
class Solution {
    public int findLeastNumOfUniqueInts(int[] arr, int k) {
        Map<Integer,Integer>hm = new HashMap<>();
        List<Integer>l = new ArrayList<>();
        for(int x:arr){
            hm.put(x,hm.getOrDefault(x,0)+1);
        }

        for(int x:hm.values()){
            l.add(x);
        }
        Collections.sort(l);
        int ans=0;
        for(int i=0;i<l.size();i++){
            if(l.get(i)<k){
                k -= l.get(i);
                l.set(i,0);
            }else{
                l.set(i,l.get(i)-k);
                k=0;
            }
            if(l.get(i) != 0) ans++;
        }
        return ans;
    }
}
