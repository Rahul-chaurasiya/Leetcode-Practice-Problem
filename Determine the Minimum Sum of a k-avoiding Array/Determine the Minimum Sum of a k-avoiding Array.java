class Solution {
    public int minimumSum(int n, int k) {
        List<Integer>list = new ArrayList<>();
        int i=1;
        int sum=0;
        while(list.size() < n){
            if(!list.contains(k-i)){
                list.add(i);
                sum += i;
            }
            i++;
        }
        return sum;
    }
}
