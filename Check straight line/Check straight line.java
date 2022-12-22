class Solution {
    public boolean checkStraightLine(int[][] coordinates) {
      
        // int x = p1[0], y = p1[1], x1 = p2[0], y1 = p2[1], x2 = p3[0], y2 = p3[1];
        // return ((y - y1) * (x2 - x1) == (y2 - y1) * (x - x1));
        // }

        // public boolean checkStraightLine(int[][] coordinates) {
        // // base case:- there are only two points, return true
        // // otherwise, check each point lies on line using above equation.
		
        // for(int i=2;i<coordinates.length;i++){
        //     if(!onLine(coordinates[i], coordinates[0], coordinates[1]))
        //         return false;
        // }
        // return true;
      

        int dy=coordinates[1][1]-coordinates[0][1];
        int dx=coordinates[1][0]-coordinates[0][0];
        
        for(int i=2;i<coordinates.length;i++){
            
            int curr_dy=coordinates[i][1]-coordinates[i-1][1];
            int curr_dx=coordinates[i][0]-coordinates[i-1][0];
            
            if(dy*curr_dx != dx*curr_dy)
                return false;
        }
        return true;
    }
    
}
