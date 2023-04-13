class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> s = new Stack<>();
        int j = 0;
        
        for(int val : pushed){
            s.push(val);
            while(!s.isEmpty() && s.peek() == popped[j]){
                s.pop();
                j++;
            }
        }
        return s.isEmpty();
    }
}
