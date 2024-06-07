class Solution {
    public String replaceWords(List<String> dict, String sentence) {
        Set<String>s = new HashSet<>(dict);
        List<String>temp = new ArrayList<>(Arrays.asList(sentence.split(" ")));
        StringBuilder sb = new StringBuilder();
        for(String t:temp){
            int i;
            for(i=0;i<t.length();i++){
                String curr = t.substring(0, i);
                if(s.contains(curr)){
                    sb.append(curr).append(" ");
                    break;
                }
            }
            if(i == t.length()) sb.append(t).append(" ");
        }
        sb.deleteCharAt(sb.length() - 1); 
        return sb.toString();
    }
}
