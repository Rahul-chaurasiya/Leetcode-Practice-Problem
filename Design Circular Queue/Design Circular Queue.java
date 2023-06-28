class MyCircularQueue {

    int front;
    int rear;
    int size;
    int cap;
    int[] arr;

    public MyCircularQueue(int x) {
        size = 0;
        front = 0;
        cap = x;
        rear = cap - 1;
        arr = new int[cap];
    }
    
    public boolean enQueue(int value) {
        if(isFull()) return false;

        rear = (rear+1)%cap;
        arr[rear] = value;
        size++;
        return true;
    }
    
    public boolean deQueue() {
        if(isEmpty()) return false;

        front = (front+1)%cap;
        size--;
        return true;
    }
    
    public int Front() {
        if(isEmpty()) return -1;
        return arr[front];
    }
    
    public int Rear() {
        if(isEmpty()) return -1;
        return arr[rear];
    }
    
    public boolean isEmpty() {
        return (size == 0);
    }
    
    public boolean isFull() {
        return (size == cap);
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */
