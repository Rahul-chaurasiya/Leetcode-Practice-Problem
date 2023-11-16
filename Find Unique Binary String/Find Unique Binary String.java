class Solution {
    public String binGenerate(String curr, int n, Set<String> binSet) {
        if (curr.length() == n) {
            if (!binSet.contains(curr)) return curr;
            return "";
        }

        String addZero = binGenerate(curr + "0", n, binSet);
        if (!addZero.isEmpty()) return addZero;

        return binGenerate(curr + "1", n, binSet);
    }

    public String findDifferentBinaryString(String[] nums) {
        int n = nums.length;
        Set<String> binSet = new HashSet<>();

        for (String s : nums) {
            binSet.add(s);
        }
        return binGenerate("", n, binSet);
    }
}
