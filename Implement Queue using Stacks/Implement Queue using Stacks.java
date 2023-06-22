class MyQueue {

    ArrayDeque<Integer>s;
    public MyQueue() {
        s = new ArrayDeque<>();
    }
    
    public void push(int x) {
        s.add(x);
    }
    
    public int pop() {
        return s.removeFirst();
    }
    
    public int peek() {
        return s.getFirst();
    }
    
    public boolean empty() {
        return s.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
