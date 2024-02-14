class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int arr[] = new int [nums.length];
        List<Integer> even = new ArrayList<>();
        List<Integer> odd = new ArrayList<>();
        
        for (int n : nums) {
            if (n % 2 == 0) even.add(n);
            else odd.add(n);
        }

        for(int i=0;i<nums.length;i++){
            if(i%2==0) arr[i] = even.remove(0);
            else arr[i] = odd.remove(0);
        }
        return arr;
    }
}
