class Solution {
    public boolean judgeCircle(String moves) {
        int[] a = new int[86];
        for (int c : moves.toCharArray()) {
            a[c]++;
        }

        return a[85] == a[68] && a[82] == a[76];
    }
}


================================================================
  
  
class Solution {
    public boolean judgeCircle(String moves) {
        int a=0,b=0;
        for(int i=0;i<moves.length();i++){
            if(moves.charAt(i)=='L') a++;
            if(moves.charAt(i)=='R') a--;
            if(moves.charAt(i)=='U') b++;
            if(moves.charAt(i)=='D') b--;
        }
        return (a==0&&b==0);
    }
}
