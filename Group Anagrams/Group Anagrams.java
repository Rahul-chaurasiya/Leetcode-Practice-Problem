class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> list = new HashMap<>();
        for(String str : strs){
            char ch[] = str.toCharArray();
            Arrays.sort(ch);
            String word = new String(ch);
            if(!list.containsKey(word)) list.put(word, new ArrayList<>());
            list.get(word).add(str);
        }
        return new ArrayList<>(list.values());
    }
}
