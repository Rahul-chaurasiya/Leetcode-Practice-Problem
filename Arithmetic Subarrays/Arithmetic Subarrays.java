class Solution {
    public List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {
        List<Boolean>ans = new ArrayList<>();
        for (int i=0;i<l.length;i++) {
           ans.add(check(nums, l[i], r[i]));
        }
        return ans;
    }

    public boolean check(int []nums,int l, int r){
        List<Integer>list = new ArrayList<>();
        for(int j=l;j<=r;j++){
            list.add(nums[j]);
        }

        Collections.sort(list);
        int diff = list.get(1)-list.get(0);
        for(int i=2;i<list.size();i++){
            if(list.get(i)-list.get(i-1) != diff) return false;
        }
        return true;
    }
}
