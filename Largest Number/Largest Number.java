class Solution {
    public String largestNumber(int[] nums) {
        String stringArray[] = new String[nums.length];
		int index = 0;
		for (int integerValue : nums) {
			stringArray[index++] = String.valueOf(integerValue);
		}

		Arrays.sort(stringArray,(a,b)->(b+a).compareTo(a+b));

		// String ans = "";
		for (int i = 1; i < stringArray.length; i++) {
			stringArray[0] += stringArray[i];
		}
		return stringArray[0].startsWith("0")?"0":stringArray[0];
    }
}
