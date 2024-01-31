class Solution {
    public int[] dailyTemperatures(int[] arr) {
        Stack<Integer>s = new Stack<>();
        int ans[] = new int[arr.length];
        for(int i=arr.length-1;i>=0;i--){
            while(!s.isEmpty() && arr[i]>=arr[s.peek()]){
                s.pop();
            }
            if(!s.isEmpty()) ans[i] = s.peek()-i;
            s.push(i);
        }
        return ans;
    }
}
