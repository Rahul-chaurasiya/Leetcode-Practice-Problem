class Solution {
    public int maxScore(String s) {
        int scorel = 0;
        int scorer = 0;
        int fnal = 0;
        if(s.charAt(0) == '0') scorel++;
        for(int i=1;i<s.length();i++){
            if(s.charAt(i) == '1') scorer++;
        }

        fnal = scorel+scorer;
        for(int i=1;i<s.length()-1;i++){
            if(s.charAt(i) == '0') scorel++;
            else scorer--;
            fnal = Math.max(fnal,scorel+scorer);
        }

        return fnal;
    }
}
