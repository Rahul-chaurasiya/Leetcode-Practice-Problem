class ParkingSystem {
    int big;
    int medium;
    int small;
    public ParkingSystem(int big, int medium, int small) {
        this.big = big;
        this.medium = medium;
        this.small = small;
    }
    
    public boolean addCar(int cartype) {
        if(cartype == 1){
            if(big>0) big--;
            else return false;
        }
        else if(cartype == 3){
            if(small>0)small--;
            else return false;
        }
        else if(cartype == 2){
            if(medium>0)medium--;
            else return false;
        }
        return true;
    }
}
