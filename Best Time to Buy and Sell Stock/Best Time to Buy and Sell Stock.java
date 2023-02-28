class Solution {
    public int maxProfit(int[] arr) {
        int low=Integer.MAX_VALUE;
        int n=arr.length;
        int maxprofit = 0;

    	for(int i=0;i<n;i++){
            if (arr[i] < low)
                low = arr[i];
            else if (arr[i] - low > maxprofit)
                maxprofit = arr[i] - low;
        }
    	return maxprofit;
    }
}
