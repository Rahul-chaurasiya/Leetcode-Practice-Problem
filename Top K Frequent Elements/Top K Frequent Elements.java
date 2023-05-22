class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        if(k == nums.length) return nums;

        int ans[] = new int[k];
        Map<Integer, Integer> map = new HashMap<>();
        for(int n:nums){
            map.put(n,map.getOrDefault(n,0)+1);
        }

        List<Map.Entry<Integer, Integer>> entryList = new ArrayList<>(map.entrySet());

        // Sort the list in descending order of values
        Collections.sort(entryList, new Comparator<Map.Entry<Integer, Integer>>() {
            @Override
            public int compare(Map.Entry<Integer, Integer> entry1, Map.Entry<Integer, Integer> entry2) {
                return entry2.getValue().compareTo(entry1.getValue()); // Compare in descending order
            }
        });

        // Create a new LinkedHashMap to store the sorted entries
        Map<Integer, Integer> sortedMap = new LinkedHashMap<>();

        int i = 0;
        // Iterate through the sorted list and put the entries into the sorted map
        for (Map.Entry<Integer, Integer> entry : entryList) {
            ans[i++] = entry.getKey();
        }
        return ans;
    }
}
