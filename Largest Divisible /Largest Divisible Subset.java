class Solution {
    public static List<Integer> largestDivisibleSubset(int[] nums) {
        
        if (nums == null || nums.length == 0) return new ArrayList<>();
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();

        for (int num : nums) {
            List<Integer> subset = new ArrayList<>();
            subset.add(num);
            result.add(subset);
        }

        for (int i = 1; i < nums.length; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[i] % nums[j] == 0 && result.get(i).size() < result.get(j).size() + 1) {
                    result.set(i, new ArrayList<>(result.get(j)));
                    result.get(i).add(nums[i]);
                }
            }
        }

        List<Integer> maxSubset = result.get(0);
        for (List<Integer> subset : result) {
            if (subset.size() > maxSubset.size()) maxSubset = subset;
        }
        return maxSubset;
    }
}
