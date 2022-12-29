

class Solution {
    public int missingNumber(int[] arr) {
        Arrays.sort(arr);
        int i;
        for(i=0;i<arr.length;i++){
            if(arr[i] != i) return i;
        }
        return i;
    }
}

========================================================

class Solution {
    public int missingNumber(int[] arr) {
        int n = arr.length;
        int xor1=0,xor2=0;
        for(int i=0;i<=n;i++){
            xor1 = xor1 ^ i; 
        }
        for(int i=0;i<n;i++){
            xor2 = xor2 ^ arr[i]; 
        }

        return (xor2^xor1);
    }
}
