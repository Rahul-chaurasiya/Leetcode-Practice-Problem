class SmallestInfiniteSet {

    int curr;
    Set<Integer>s;
    public SmallestInfiniteSet() {
        curr = 1;
        s = new HashSet<>();
    }
    
    public int popSmallest() {
        if (!s.isEmpty()) {
            int res = Collections.min(s);
            s.remove(res);
            return res;
        } else {
            curr++;
            return curr - 1;
        }
    }
    
    public void addBack(int num) {
        if (curr > num) {
            s.add(num);
        }
    }
}

/**
 * Your SmallestInfiniteSet object will be instantiated and called as such:
 * SmallestInfiniteSet obj = new SmallestInfiniteSet();
 * int param_1 = obj.popSmallest();
 * obj.addBack(num);
 */