class Solution {
    public boolean isPathCrossing(String path) {
        Set<String>s = new HashSet<>();
        s.add("0,0");
        int x = 0;
        int y = 0;
        for(char ch:path.toCharArray()){
            String str = "";
            if(ch == 'E') x++;
            else if(ch == 'W') x--;
            else if(ch == 'S') y--;
            else if(ch == 'N') y++;

            str = x+","+y;
            System.out.println(str);
            if(s.contains(str)) return true;
            else s.add(str);
        }
        return false;
    }
}
