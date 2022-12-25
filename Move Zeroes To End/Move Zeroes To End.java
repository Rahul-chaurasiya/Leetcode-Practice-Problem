class Solution {
    public void moveZeroes(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {                     
                int temp = arr[i];
                arr[count] = arr[i];
                count++;
            }
        }

        for(int i=arr.length-1;i>=count;i--){
            arr[i]=0;
        }
    }
}
