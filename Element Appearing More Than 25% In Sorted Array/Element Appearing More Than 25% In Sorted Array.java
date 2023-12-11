class Solution {
    public int findSpecialInteger(int[] arr) {
        int count = 1;
        for(int i=0;i<arr.length;i++){
            if(count > arr.length/4) return arr[i];
            if(arr[i] == arr[i+1]) count++;
            else count = 1;
        }
        return 0;
    }
}
