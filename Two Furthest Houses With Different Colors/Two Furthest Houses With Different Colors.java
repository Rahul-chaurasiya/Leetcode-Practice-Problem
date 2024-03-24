class Solution {
    public int maxDistance(int[] colors) {
        int first = colors[0];
        int index = 0;
        for(int a = 1; a < colors.length; a++){
            if(colors[a] != first) index = a;
        }
        int last = colors[colors.length-1];
        int index2 = colors.length-1;
        for(int a = colors.length-1; a > -1; a--){
            if(colors[a] != last) index2 = a;
        }
        int revindex = (colors.length-1)-index2;
        return Math.max(index, revindex);
    }
}
