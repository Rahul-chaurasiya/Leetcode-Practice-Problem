class MyStack {
     Queue<Integer> q;
    public MyStack() {
        q=new LinkedList<>();
    }
    
    public void push(int x) {
        q.add(x);
        for(int i=1;i<q.size();i++)
           q.add(q.remove());
    }
    
    public int pop() {
        return q.remove();
    }
    
    public int top() {
        return q.peek();
    }
    
    public boolean empty() {
        return q.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */


=============================================================================================


class MyStack {

    Queue<Integer> q1 = new LinkedList<Integer>(); 
	Queue<Integer> q2 = new LinkedList<Integer>();
    int size;

    public MyStack() {
        size = 0;
    }
    
    public void push(int x) {
        size++;
        q2.add(x);

        while(!q1.isEmpty()){
            q2.add(q1.peek());
            q1.remove();
        }

        Queue<Integer>q = q2;
        q2 = q1;
        q1 = q;
    }
    
    public int pop() {
        if (q1.isEmpty()) 
			return -1; 
        int x = q1.peek();
		q1.remove(); 
		size--; 
        return x;
    }
    
    public int top() {
        if (q1.isEmpty()) 
			return -1; 
		return q1.peek();
    }
    
    public boolean empty() {
        return q1.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */
