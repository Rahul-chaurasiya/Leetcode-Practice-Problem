class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        int square = 0;
        int circle = 0;
        for(int x:students){
            if(x == 1) circle++;
            else square++;
        }

        for(int x:sandwiches){
            if(x==0 && square>0) square--;
            else if(x==1 && circle>0) circle--;
            else return circle+square;
        }
        return 0;
    }
}
