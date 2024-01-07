class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
       int freq[] = new int[nums.length + 1];
       ArrayList<List<Integer>> ans = new ArrayList<>();
       for(int e : nums) {
           if(freq[e] >= ans.size()) {
               ans.add(new ArrayList<>());
           }
           ans.get(freq[e]).add(e);
           freq[e]++;
       }
       return ans; 
    }
}
