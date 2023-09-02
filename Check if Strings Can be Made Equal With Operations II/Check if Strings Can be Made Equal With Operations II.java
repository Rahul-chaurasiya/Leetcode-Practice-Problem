class Solution {
    public boolean checkStrings(String s1, String s2) {
        int n = s1.length();
        
        char[] evenCharsS1 = new char[n];
        char[] oddCharsS1 = new char[n];
        char[] evenCharsS2 = new char[n];
        char[] oddCharsS2 = new char[n];
        
        int evenIndexS1 = 0;
        int oddIndexS1 = 0;
        int evenIndexS2 = 0;
        int oddIndexS2 = 0;
        
        for (int i = 0; i < n; i++) {
            char charS1 = s1.charAt(i);
            char charS2 = s2.charAt(i);
            
            if (i % 2 == 0) {
                evenCharsS1[evenIndexS1++] = charS1;
                evenCharsS2[evenIndexS2++] = charS2;
            } else {
                oddCharsS1[oddIndexS1++] = charS1;
                oddCharsS2[oddIndexS2++] = charS2;
            }
        }
        
        
        Arrays.sort(evenCharsS1);
        Arrays.sort(oddCharsS1);
        Arrays.sort(evenCharsS2);
        Arrays.sort(oddCharsS2);
        
        return Arrays.equals(evenCharsS1, evenCharsS2) && Arrays.equals(oddCharsS1, oddCharsS2);
    }
}
