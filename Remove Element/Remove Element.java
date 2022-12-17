

class Solution {
    public int removeElement(int[] arr, int val) {
        int n=arr.length;
        int count=0;
        for(int i=0;i<n;i++){
            if(arr[i] != val){
                arr[count++] = arr[i];
            }
        }
        return count;
    }
}
