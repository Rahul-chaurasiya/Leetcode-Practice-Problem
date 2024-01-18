class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        int ans[] = new int[2003];
        for(int x:arr){
            ans[x+1000]++;
        }

        Set<Integer>s = new HashSet<>();
        int count=0;
        for(int i=0;i<ans.length;i++){
            if(ans[i]>0){
                count++;
                s.add(ans[i]);
            }
        }
        return count == s.size();
    }
}
