

class Solution {
    public List<Boolean> kidsWithCandies(int[] a, int extra) {
        List result = new ArrayList<>();
        int n=a.length;
        int max=0;
        for(int i=0;i<n;i++){
            max = Math.max(max,a[i]);
        }

        for(int i=0;i<n;i++){
            if((a[i]+extra) >= max) result.add(i, true);
            else result.add(i,false);
        }

        return result;
    }
}
