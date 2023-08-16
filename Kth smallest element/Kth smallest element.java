class Solution{
    public static int kthSmallest(int[] arr, int l, int r, int k) 
    { 
        //Your code here
        TreeSet<Integer> numbers = new TreeSet<>();
        for(int x : arr) numbers.add(x);
        Iterator<Integer> i = numbers.iterator();
        while(k-- > 1) i.next();
        return i.next();
    } 
}
