class Solution {
    public String removeDuplicates(String s, int k) {
        Stack<Pair<Character, Integer>> stack = new Stack<>();

        for (char ch : s.toCharArray()) {
            if (!stack.isEmpty() && stack.peek().getKey() == ch) {
                Pair<Character, Integer> top = stack.pop();
                int count = top.getValue() + 1;
                if (count < k) {
                    stack.push(new Pair<>(ch, count));
                }
            } else {
                stack.push(new Pair<>(ch, 1));
            }
        }

        StringBuilder result = new StringBuilder();
        while (!stack.isEmpty()) {
            Pair<Character, Integer> top = stack.pop();
            for (int i = 0; i < top.getValue(); i++) {
                result.insert(0, top.getKey());
            }
        }

        return result.toString();
    }
}
