class Solution {
    public List<Integer> majorityElement(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        List<Integer>list = new ArrayList<>();
        for(int x:nums){
            map.put(x,map.getOrDefault(x,0)+1);
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int key = entry.getKey();
            int value = entry.getValue();
            if(value > nums.length/3) list.add(key);
        }
        return list;
    }
}
