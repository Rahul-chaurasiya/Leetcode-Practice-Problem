class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder sc1 = new StringBuilder();
        StringBuilder sc2 = new StringBuilder();
        for(String s:word1){
            sc1.append(s);
        }

        for(String s:word2){
            sc2.append(s);
        }

        return sc1.toString().equals(sc2.toString());
    }
}
