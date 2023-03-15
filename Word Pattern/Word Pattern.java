class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character,String> mp = new HashMap<>();
        char[] alpha = pattern.toCharArray();
        String[] words = s.split("\\s+");
        if(words.length!=pattern.length()) return false;
        int i=0;
        for(char ch : alpha){
            if(mp.containsKey(ch)){
                if(!mp.get(ch).equals(words[i++]))
                return false;
            }
            else{
                if(mp.containsValue(words[i]))
                return false;
                mp.put(ch,words[i++]);
            }
        }
        return true;
    }
}
