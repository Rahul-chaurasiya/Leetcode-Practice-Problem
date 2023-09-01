class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        int cr = 0;
        int cl = 0;
        for(char ch : moves.toCharArray()){
            if(ch == 'R')cr++;
            else if(ch == 'L')cl++;
        }
        if(cr > cl) return ((cr-cl)+(moves.length()-(cr+cl)));
        else if(cl > cr) return ((cl-cr)+(moves.length()-(cr+cl)));
        else return (moves.length()-(cr+cl));
    }
}
