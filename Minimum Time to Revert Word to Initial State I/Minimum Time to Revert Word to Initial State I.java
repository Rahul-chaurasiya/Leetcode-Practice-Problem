class Solution {
    public int minimumTimeToInitialState(String word, int k) {
        String str = word;
        int count = 0;
        int ans = 0;
        for(int j=1;j<=60;j++){
            for(int i=0;i<k;i++) word += '1';
            count++;
            ans += k;
            if(same(word,ans)) return count;  
        }
        return 0;
    }
    
    private boolean same(String word,int x){
        for(int i=0;i<word.length();i++){
            if(i+x<word.length()&&i < word.length() && word.charAt(i + x) != '1' && word.charAt(i) != word.charAt(i + x)) return false;
        }
        return true;
    }
}
