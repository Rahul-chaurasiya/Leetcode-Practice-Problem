class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int ans = 0;
        int n = customers.length;
        for(int i=0;i<n;i++){
            if(grumpy[i] == 0) ans += customers[i];
        }

        int sum = 0;
        for(int i=0;i<minutes;i++){
            if(grumpy[i] == 1) sum += customers[i];
        }

        int max = sum;
        for(int i=minutes;i<n;i++){
            if(grumpy[i-minutes] == 1) sum -= customers[i-minutes];
            if(grumpy[i] == 1) sum += customers[i];
            max = Math.max(max,sum);
        }
        return ans+max;
    }
}
