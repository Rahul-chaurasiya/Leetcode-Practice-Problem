class Solution {
    public int[] topKFrequent(int[] nums, int k) {
    Map<Integer, Integer> freq = new HashMap<>();
    
    for (int i : nums) {
        freq.merge(i, 1, Integer::sum);
    }
    
    return freq.entrySet()
            .stream()
            .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
            .limit(k)
            .map(Map.Entry::getKey)
            .mapToInt(i -> i)
            .toArray();
}
}

