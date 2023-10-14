class Solution {
    public List<Integer> lastVisitedIntegers(List<String> words) {
        
        List<Integer> st = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();
        int count = 0;

        for (String word:words) {
            if (word.equals("prev")) {
                count += 1;
                if (st.size() >= count) ans.add(st.get(st.size() - count));
                else ans.add(-1);
            } else {
                st.add(Integer.parseInt(word));
                count = 0;
            }
        }
        return ans;
    }
}
