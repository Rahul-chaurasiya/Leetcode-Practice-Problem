class Solution {
    public int minLength(String s) {
        Stack<Character> stack = new Stack<>();
        
        for (char c : s.toCharArray()) {
            if (!stack.isEmpty() && (stack.peek() == 'A' && c == 'B' || stack.peek() == 'C' && c == 'D')) {
                stack.pop(); // Remove the matching substring from the stack
            } else {
                stack.push(c); // Add the character to the stack
            }
        }
        
        return stack.size();
        
    }
}
