class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int f_index=0;
        int l_index=numbers.length-1;
        int ans[] = new int[2];
        for(int i=0;i<numbers.length;i++){
            if((numbers[f_index]+numbers[l_index])<target){
                f_index++;
            }
            else if((numbers[f_index]+numbers[l_index])>target){
                l_index--;
            }
            else if((numbers[f_index]+numbers[l_index]) == target){
                ans[0] = f_index+1;
                ans[1] = l_index+1;
            }
        }
        return ans;
    }
}
