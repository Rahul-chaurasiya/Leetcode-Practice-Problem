class Solution {
    public int findKthPositive(int[] arr, int k) {
        for(int t : arr){
            if(t<=k)k++;
        }
        return k;
    }
}
