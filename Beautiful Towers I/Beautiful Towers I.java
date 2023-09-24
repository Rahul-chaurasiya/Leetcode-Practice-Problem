class Solution {
    public long maximumSumOfHeights(List<Integer> list) {
        int n = list.size();
        int max = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(list.get(i)>max) max = list.get(i);
        }
        
        long ans = 0;
        for(int i=0;i<n;i++){
            long sum = 0;
            int p = max;
            for(int j=i;j<n;j++){
                if(list.get(j)>=p) sum += p;
                else{
                    p=list.get(j);
                    sum += list.get(j);
                }
            }
            p = max;
            for(int j=i-1;j>=0;j--){
                if(list.get(j)>=p) sum+=p;
                else{
                    p=list.get(j);
                    sum+=list.get(j);
                }
            }
            ans = Math.max(ans,sum);
        }
        
        return ans;

    }
}
