class Solution {
    public double average(int[] salary) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for(int i = 0; i < salary.length; i++){
            min = Math.min(min,salary[i]);
            max = Math.max(max,salary[i]);
            sum += salary[i];
        }
        return (double)(sum-(min+max))/(salary.length-2);
    }
}
