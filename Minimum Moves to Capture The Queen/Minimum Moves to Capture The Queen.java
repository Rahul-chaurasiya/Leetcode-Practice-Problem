class Solution {
    public int minMovesToCaptureTheQueen(int a, int b, int c, int d, int e, int f) {
        int rook = 2, bishop = 2;
        if (a == e || b == f) {
            if (a == e && c == a) {
                if (b < d && d < f) return 2;
                if (b > d && d > f) return 2;
            }
            else if (b == f && d == b) {
                if (a < c && c < e) return 2;
                if (a > c && c > e) return 2;
            } 
            rook = 1;
        }
        if (Math.abs(c-e) == Math.abs(d-f)) {
            if (Math.abs(a-c) == Math.abs(b-d)) {
                if (c < a && a < e) { 
                    if (d < b && b < f) return 2;
                    if (d > b && b > f) return 2;
                }
                if (c > a && a > e) {
                    if (d < b && b < f) return 2;
                    if (d > b && b > f) return 2;
                }
            }
            bishop = 1;
        }
        return Math.min(rook, bishop);
    }
}
