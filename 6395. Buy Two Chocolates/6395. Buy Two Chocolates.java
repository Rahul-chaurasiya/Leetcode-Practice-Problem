class Solution {
    public int buyChoco(int[] prices, int money) {
        Arrays.sort(prices);
        int x = prices[0]+prices[1];
        if(money-x>=0) return money-x;
        else return money;
    }
}
