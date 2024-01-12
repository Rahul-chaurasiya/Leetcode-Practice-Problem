class Solution {
    public int areaOfMaxDiagonal(int[][] arr) {
        int ans = 0;
        double digmax = 0;
        for(int i=0;i<arr.length;i++){
            double dig = Math.sqrt(arr[i][0]*arr[i][0]+arr[i][1]*arr[i][1]);
            if(dig >= digmax){
                if(digmax == dig) ans = Math.max(ans,arr[i][0]*arr[i][1]);
                else ans = arr[i][0]*arr[i][1];
                digmax = dig;
            }
        }
        return ans;
    }
}
