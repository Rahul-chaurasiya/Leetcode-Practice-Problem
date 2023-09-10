class Solution {
    public boolean isReachableAtTime(int sx, int sy, int fx, int fy, int t) {
        if(sx == fx && sy == fy && t == 1)return false;
        int x = Math.abs(fx-sx);
        int y = Math.abs(fy-sy);
        
        int min = Math.min(x,y)+(Math.abs(x-y));
        if(min<=t)return true;
        else return false;

    }
}
