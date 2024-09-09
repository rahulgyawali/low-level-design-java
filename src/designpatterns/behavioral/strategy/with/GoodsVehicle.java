package designpatterns.behavioral.strategy.with;

public class GoodsVehicle extends Vehicle{

    GoodsVehicle(){
        super(new NormalDrivingStrategy());
    }
}
