class Solution {
    public boolean stoneGame(int[] piles) {
        int n = piles.length;
        piles = new int[n + 1];
        piles[n] = 0;
        int alice = 0;
        int bob = 0;
        int x = piles[0], y = piles[n - 1];
        int res;
        int s_index = 0, l_index = n - 1;
        for (int i = 0; i < n / 2; i++) {
            res = Math.max(x, y);
            if (res == x) x = piles[++s_index];
            else y = piles[--l_index];
            alice += res;

            res = Math.max(x, y);
            if (res == x) x = piles[++s_index];
            else y = piles[--l_index];
            bob += res;
        }
        if (bob > alice) return false;
        else return true;
    }
}
