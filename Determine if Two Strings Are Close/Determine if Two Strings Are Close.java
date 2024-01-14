class Solution {
    public boolean closeStrings(String word1, String word2) {
        if(word1.length() != word2.length()) return false;
        int arr1[] = new int[26];
        int arr2[] = new int[26];
        for(int i=0;i<word1.length();i++){
            arr1[word1.charAt(i)-'a']++;
            arr2[word2.charAt(i)-'a']++;
        }

        List<Integer>l1 = new ArrayList<>();
        List<Integer>l2 = new ArrayList<>();

        for(int i=0;i<arr1.length;i++){
            if(arr1[i]>0) l1.add(i);
            if(arr2[i]>0) l2.add(i);
        }

        if(l1.size() != l2.size()) return false;
        for(int i=0;i<l1.size();i++){
            if(l1.get(i) != l2.get(i)) return false;
            System.out.println(l1.get(i)+" "+l2.get(i));
        }

        Arrays.sort(arr1);
        Arrays.sort(arr2);
        for(int i=0;i<arr1.length;i++){
            System.out.println(arr1[i]+" "+arr2[i]);
            if(arr1[i] != arr2[i])return false;
        }
        return true;
    }
}
