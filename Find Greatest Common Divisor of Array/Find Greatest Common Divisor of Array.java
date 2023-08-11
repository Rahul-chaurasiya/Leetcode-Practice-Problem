class Solution {
    public int findGCD(int[] nums) {
        int min = 1001;
        int max = 0;
        for (int i : nums) {
            min = Math.min(min, i);
            max = Math.max(max, i);
        }
        int res = Math.min(min, max);
        while (res > 0) {
            if (min % res == 0 && max % res == 0) {
                break;
            }
            res--;
        }
        return res;
    }
}
