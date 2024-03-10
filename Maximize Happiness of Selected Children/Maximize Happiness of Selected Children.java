class Solution {
    public long maximumHappinessSum(int[] arr, int k) {
        Arrays.sort(arr);
        long ans = 0;
        for(int i=0,j=arr.length-1;i<k;i++){
            ans += Math.max(arr[j]-i,0);
            j--;
        }
        return ans;
    }
}
