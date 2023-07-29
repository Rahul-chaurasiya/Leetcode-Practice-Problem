class Solution {
    public String sortVowels(String s) {
        List<Character>l=new ArrayList<>();
        char ch[] = s.toCharArray();
        for(char c : ch){
            if(isVowel(c))l.add(c);
        }
        Collections.sort(l);

        for(int i=0;i<ch.length;i++){
            if(isVowel(ch[i])){
                ch[i]=l.get(0);
                l.remove(0);
            }
        }

        return String.valueOf(ch);
    }

    public boolean isVowel(char c) {
        return c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U' || c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}
