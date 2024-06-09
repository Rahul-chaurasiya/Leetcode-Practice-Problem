class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int count = 0;
        int temp = 0;
        HashMap<Integer,Integer>hm = new HashMap<>();
        hm.put(0,1);
        for(int x:nums){
            temp += x;
            int mod = temp%k;
            if(mod<0) mod += k;
            if(hm.containsKey(mod)){
                count += hm.get(mod);
                hm.put(mod,hm.get(mod)+1);
            } else hm.put(mod,1);
        }
        return count;
    }
}
