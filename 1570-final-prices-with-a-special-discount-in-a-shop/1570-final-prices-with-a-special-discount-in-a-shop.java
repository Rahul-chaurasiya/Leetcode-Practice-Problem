class Solution {
    public int[] finalPrices(int[] prices) {
        int n = prices.length;
        int ans[] = new int[n];
        ArrayDeque<Integer>q = new ArrayDeque<>();
        q.push(prices[n-1]);
        ans[n-1] = prices[n-1];

        for(int i=n-2;i>=0;i--){
            while(!q.isEmpty() && q.peek()>prices[i]) q.pop();
            if(q.isEmpty()) ans[i] = prices[i];
            else ans[i] = prices[i] - q.peek();
            q.push(prices[i]);
        }
        return ans;
    }
}