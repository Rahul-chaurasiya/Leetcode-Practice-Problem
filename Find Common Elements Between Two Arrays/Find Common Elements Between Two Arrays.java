class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
      
        List<Integer>l1 = new ArrayList<>();
        List<Integer>l2 = new ArrayList<>();

        for(int x:nums1) l1.add(x);
        for(int x:nums2) l2.add(x);
        
        int count1 = 0;
        int count2 = 0;
        for(int x:nums1){
            if(l2.contains(x)) count1++;
        }
        
        for(int x:nums2){
            if(l1.contains(x)) count2++;
        }
        
        return new int[]{count1,count2};
    }
}
