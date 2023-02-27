class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        HashMap<Character,Integer>h  = new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            h.put(ch,h.getOrDefault(ch,0)+1);
        }

        for(int i=0;i<t.length();i++){
            char ch = t.charAt(i);
            if(h.get(ch)!=null){
                if(h.get(ch)==1)h.remove(ch);
                else h.put(ch,h.getOrDefault(ch,0)-1);
            }
            else return false;
        }
        return true;
    }
}

====================================================================================

class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        int arr[] = new int[26];
        for(char ch:s.toCharArray()) arr[ch-97]++;
        for(char ch:t.toCharArray()) arr[ch-97]--;
        for(int i:arr) if(i!=0) return false;
        return true;
    }
}
