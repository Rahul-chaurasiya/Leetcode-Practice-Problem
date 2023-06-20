class StockSpanner {

    ArrayDeque<Integer[]> stack = new ArrayDeque<>();
    public StockSpanner() {
        stack = new ArrayDeque<>();
    }
    
    public int next(int price) {
        int i = 1;
        while(stack.isEmpty() == false && stack.peek()[0] <= price){
            i += stack.pop()[1];
        }

        stack.push(new Integer[] {price,i});
        return i;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */
