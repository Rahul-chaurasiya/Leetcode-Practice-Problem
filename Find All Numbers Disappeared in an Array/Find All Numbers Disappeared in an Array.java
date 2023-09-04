

class Solution
{
    public List<Integer> findDisappearedNumbers(int[] nums)
    {
        HashSet<Integer> uniqueNumbers = new HashSet<>();
        ArrayList<Integer> missingNumbers = new ArrayList<>();

        for (int num : nums) uniqueNumbers.add(num);

        for (int i = 1; i <= nums.length; i++){
            if (!uniqueNumbers.contains(i)) missingNumbers.add(i);
        }

        return missingNumbers;
    }
}
