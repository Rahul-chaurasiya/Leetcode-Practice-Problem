public class Solution {
    public boolean winnerOfGame(String colors) {
        Map<Character, Integer> m = new HashMap<>();
        m.put('A', 0);
        m.put('B', 0);
        
        for (int i = 0; i < colors.length(); i++) {
            char ch = colors.charAt(i);
            int count = 0;
            
            while (i < colors.length() && colors.charAt(i) == ch) {
                i++;
                count++;
            }
            
            m.put(ch, m.get(ch) + Math.max(count - 2, 0));
            i--;
        }

        return m.get('A') > m.get('B');
    }
}
