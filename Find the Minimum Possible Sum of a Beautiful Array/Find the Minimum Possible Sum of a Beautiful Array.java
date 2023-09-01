class Solution {
    public long minimumPossibleSum(int n, int target) {
        Set<Long>list = new HashSet<>();
        long sum = 0;
        long i = 1;
        while(list.size() < n){
            if(!list.contains(target-i)){
                list.add(i);
                sum += i;
            }
            i++;
        }
        System.out.println(list);
        return sum;
    }
}
