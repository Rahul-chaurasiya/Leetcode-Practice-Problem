class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        ArrayList<Integer> l = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>();

        for(int i=0;i<nums1.length;i++){
            l.add(nums1[i]);
        }
        for(int i=0;i<nums2.length;i++){
            if(l.contains(nums2[i])){
                l2.add(nums2[i]);
                l.remove(l.indexOf(nums2[i]));
            }
        }

        int size = l2.size();
        int ans [] = new int[size];
        for(int i=0; i<size; i++){
            ans[i] =l2.get(i);
        }
        
        return ans;
    }
}


===================================================================================
  
  
class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        ArrayList<Integer> l = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>();

        for(int i=0;i<nums1.length;i++){
            l.add(nums1[i]);
        }
        for(int i=0;i<nums2.length;i++){
            if(l.contains(nums2[i])){
                l2.add(nums2[i]);
                l.remove(l.indexOf(nums2[i]));
            }
        }

        int size = l2.size();
        int ans [] = new int[size];
        for(int i=0; i<size; i++){
            ans[i] =l2.get(i);
        }
        
        return ans;
    }
}
