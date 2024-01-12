class Solution {
    public int maximumSetSize(int[] nums1, int[] nums2) {
        int n = nums1.length;
        Map<Integer,Integer> m1 = new HashMap<>();
        Map<Integer,Integer> m2 = new HashMap<>();

        for (int i=0;i<n;i++){
            m1.put(nums1[i],m1.getOrDefault(nums1[i],0)+1);
        }
        for (int i=0;i<n;i++){
            m2.put(nums2[i],m2.getOrDefault(nums2[i],0)+1);
        }

        Set<Integer> set = new TreeSet<>();
        int cnt = 0;
        for (int i=0;i<n&&cnt!=n/2;i++){
            if (!m2.containsKey(nums1[i])&&!set.contains(nums1[i])){
                set.add(nums1[i]);
                cnt++;
            }
        }
  
        for (int i=0;i<n&&cnt!=n/2;i++){
            if (!set.contains(nums1[i])){
                set.add(nums1[i]);
                cnt++;
            }
        }


        cnt=0;
        for (int i=0;i<n&&cnt!=n/2;i++){
            if (!set.contains(nums2[i])){
                set.add(nums2[i]);
                cnt++;
            }
        }
        return set.size();
}}
