

class Solution {
    public int singleNumber(int[] arr) {
        int res=arr[0];
        for(int i=1;i<arr.length;i++){
            res = arr[i]^res;
        }
        return res;
    }
}
