class Solution {
    public int largestInteger(int num) {
        String s = ""+num;
        ArrayList<Integer> odd = new ArrayList<>();
        ArrayList<Integer> even = new ArrayList<>();
        int rem;
        while(num!=0){
            rem = num%10;
            if(rem%2==0) even.add(rem);
            else odd.add(rem);
            num /= 10;
        }

        Collections.sort(odd,Collections.reverseOrder());
        Collections.sort(even,Collections.reverseOrder());
        int result = 0;
        for(int i=0,a=0,b=0;i<s.length();i++){
            int k = Integer.valueOf(""+s.charAt(i));
            if(k%2==0){
                result=result*10+even.get(a++);
            }else{
                result=result*10+odd.get(b++);
            }
        }
        return result;
    }
}
