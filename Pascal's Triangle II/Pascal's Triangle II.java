class Solution {
    public List<Integer> getRow(int num) {
        if(num == 0) return new ArrayList<>(Arrays.asList(1));
        List<List<Integer>>list  = new ArrayList<>();
        for (int i = 0; i <= num; i++){
            List<Integer>l = new ArrayList<>();
            for(int j=0;j<=i;j++){
                if(j==0 || j==i) l.add(1);
                else l.add(list.get(i-1).get(j-1)+list.get(i-1).get(j));
            }
            list.add(l);
        }
        return list.get(num);
    }
}
