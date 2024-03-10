class Solution {
    public int minimumBoxes(int[] apple, int[] arr) {
        Arrays.sort(arr);
        int n = arr.length;
        int app = 0;
        int ans = 0;
        for(int i=0;i<apple.length;i++){
            app += apple[i];
        }
        
        for(int i=arr.length-1;i>=0;i--){
            if(app<=0){
                return ans;
            }else{
                app -= arr[i];
                ans++;
            }
            if(app<=0) return ans;
        }
        return 0;        
    }
}
