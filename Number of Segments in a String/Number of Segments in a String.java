class Solution {
    public int countSegments(String s) {
        String[] str = s.split(" ");
        int count = 0;
        for (String i : str)
        {
            if (!Objects.equals(i, ""))
                count++;
        }
        return count;
    }
}
