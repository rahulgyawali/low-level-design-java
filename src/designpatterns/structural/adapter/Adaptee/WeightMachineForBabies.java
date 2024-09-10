package designpatterns.structural.adapter.Adaptee;

public class WeightMachineForBabies implements WeightMachine{

    @Override
    public double getWeightInPound(){
        return 20;
    }
}
