class Solution {
    public boolean halvesAreAlike(String s) {
        Set<Character>l = new HashSet<>();
        l.add('a'); 
        l.add('e'); 
        l.add('i'); 
        l.add('o'); 
        l.add('u');
        l.add('A'); 
        l.add('E'); 
        l.add('I'); 
        l.add('O'); 
        l.add('U');

        int c1 = 0;
        int c2 = 0;
        int mid = s.length()/2;
        for(int i=0;i<mid;i++){
            if(l.contains(s.charAt(i))) c1++;
            if(l.contains(s.charAt(i+mid))) c2++;
        }

        return c1==c2;
    }
}
