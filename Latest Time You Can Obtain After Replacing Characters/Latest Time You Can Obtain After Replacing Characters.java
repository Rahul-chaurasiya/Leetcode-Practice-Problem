class Solution {
    public String findLatestTime(String s) {
        char ch[] = s.toCharArray();
        if(ch[0] == '?'){
            if(ch[1] == '?' || ch[1] < '2') ch[0] = '1';
            else ch[0] = '0';
        }

        if(ch[1] == '?'){
            if(ch[0] == '1') ch[1] = '1';
            else ch[1] = '9';
        }

        if(ch[3] == '?') ch[3] = '5';
        if(ch[4] == '?') ch[4] = '9';

        return new String(ch);
    }
}
