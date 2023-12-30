class Solution {
    public String[] findWords(String[] words) {
        List<String>ans = new ArrayList<>();
        List<Character>ch1 = new ArrayList<>();
        List<Character>ch2 = new ArrayList<>();
        List<Character>ch3 = new ArrayList<>();
        ch1.add('q');
        ch1.add('w');
        ch1.add('e');
        ch1.add('r');
        ch1.add('t');
        ch1.add('y');
        ch1.add('u');
        ch1.add('i');
        ch1.add('o');
        ch1.add('p');

        ch2.add('a');
        ch2.add('s');
        ch2.add('d');
        ch2.add('f');
        ch2.add('g');
        ch2.add('h');
        ch2.add('j');
        ch2.add('k');
        ch2.add('l');
        
        ch3.add('z');
        ch3.add('x');
        ch3.add('c');
        ch3.add('v');
        ch3.add('b');
        ch3.add('n');
        ch3.add('m');
        for(String wrd:words){
            String word = wrd.toLowerCase();
            if(ch1.contains(word.charAt(0))) if(check(word,ch1)) ans.add(wrd);
            if(ch2.contains(word.charAt(0))) if(check(word,ch2)) ans.add(wrd);
            if(ch3.contains(word.charAt(0))) if(check(word,ch3)) ans.add(wrd);
        }

        return ans.toArray(new String[0]);
    }

    public boolean check(String word,List<Character>ch){
        for(int i=1;i<word.length();i++){
            if(!ch.contains(word.charAt(i))) return false;
        }
        return true;
    }
}
