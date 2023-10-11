class Solution {
    public int[] fullBloomFlowers(int[][] flowers, int[] persons) {
        int n = persons.length;
        int[] result = new int[n];
        
        TreeMap<Integer, Integer> treeMap = new TreeMap<>();
        for (int i = 0; i < flowers.length; i++) {
            treeMap.put(flowers[i][0], treeMap.getOrDefault(flowers[i][0], 0) + 1);
            treeMap.put(flowers[i][1] + 1, treeMap.getOrDefault(flowers[i][1] + 1, 0) - 1);
        }
        
        TreeMap<Integer, Integer> sum = new TreeMap<>();
        int prev = 0;
        for (Map.Entry<Integer, Integer> entry : treeMap.entrySet()) {
            prev += entry.getValue();
            sum.put(entry.getKey(), prev);
        }
        
        for (int i = 0; i < n; i++) {
            Map.Entry<Integer, Integer> entry = sum.floorEntry(persons[i]);
            if (entry != null) result[i] = entry.getValue(); 
        }
        return result;
    }
}