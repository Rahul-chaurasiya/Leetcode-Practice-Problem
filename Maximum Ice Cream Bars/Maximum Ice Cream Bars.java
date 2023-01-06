
class Solution {
    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        int res=0,ttl=0;
        for(int i=0;i<costs.length;i++){
            ttl += costs[i];
            if(ttl>coins) break;
            res++;
        }
        return res;
    }
}
