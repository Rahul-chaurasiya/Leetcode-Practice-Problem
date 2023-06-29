class FrontMiddleBackQueue {

    List<Integer>l;
    public FrontMiddleBackQueue() {
        l=new ArrayList();
    }
    
    public void pushFront(int val) {
        l.add(0,val);
    }
    
    public void pushMiddle(int val) {
        l.add(l.size()/2,val);        
    }
    
    public void pushBack(int val) {
        l.add(val);
    }
    
    public int popFront() {
        if(l.isEmpty()) return -1;
        return l.remove(0);
    }
    
    public int popMiddle() {
        if(l.isEmpty()) return -1;
        int midIndex = (l.size() - 1) / 2;
        return l.remove(midIndex);
    }
    
    public int popBack() {
        if(l.isEmpty()) return -1;
        return (l.remove(l.size()-1));
    }
}

/**
 * Your FrontMiddleBackQueue object will be instantiated and called as such:
 * FrontMiddleBackQueue obj = new FrontMiddleBackQueue();
 * obj.pushFront(val);
 * obj.pushMiddle(val);
 * obj.pushBack(val);
 * int param_4 = obj.popFront();
 * int param_5 = obj.popMiddle();
 * int param_6 = obj.popBack();
 */
