class Solution {
    public int distanceTraveled(int mainTank, int additionalTank) {
        int dis=0;
        while(true){
            if(mainTank>=5 && additionalTank > 0){
                mainTank -= 4;
                dis += 50;
                additionalTank--;
            }else{
                dis += mainTank*10;
                break;
            }
        }
        return dis;
        
    }
}
