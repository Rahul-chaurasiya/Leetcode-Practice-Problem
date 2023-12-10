class Solution {
    public List<Integer> getGoodIndices(int[][] variables, int target) {
        List<Integer>l=new ArrayList<>();
        for(int i=0;i<variables.length;i++){
            
            int n1 = 1;
            for (int j = 0; j < variables[i][1]; j++) {
                n1 = (n1*(int)Math.pow(variables[i][0],1)) % 10;
            }
            
            int n2 = 1;
            for (int j = 0; j < variables[i][2]; ++j) {
                n2 = (n2 * n1) % variables[i][3];
            }
            if(n2 == target) l.add(i);
        }
        return l;
    }
}
