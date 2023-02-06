class Solution {
    public int[] shuffle(int[] nums, int n) {
        List<Integer> l = new ArrayList<>();
        for(int i=0;i<n;i++){
            l.add(nums[i]);
            l.add(nums[i+n]);
        }
        int[] array = new int[l.size()];
        for(int i = 0; i < l.size(); i++) array[i] = l.get(i);
        return array;
    }
}


=================================================================
    

class Solution {
    public int[] shuffle(int[] nums, int n) {
        int ans[] = new int[2*n];
        int k=0;
        for(int i=0;i<n;i++){
            ans[i*2] = nums[i];
            ans[i*2+1] = nums[i+n];
        }
        return ans;
    }
}
