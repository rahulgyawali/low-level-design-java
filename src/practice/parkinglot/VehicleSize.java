package practice.parkinglot;

public enum VehicleSize {
    SMALL(1),
    MEDIUM(2),
    LARGE(3);

    private final int size;

    VehicleSize(int size){
        this.size = size;
    }

    int getSize(){
        return this.size;
    }
}
