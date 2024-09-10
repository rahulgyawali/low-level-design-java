package designpatterns.structural.adapter.Adapter;

import designpatterns.structural.adapter.Adaptee.WeightMachine;

public class WeightMachineAdapterImpl implements WeightMachineAdapter{

    WeightMachine weightMachine;

    public WeightMachineAdapterImpl(WeightMachine weightMachine){
        this.weightMachine = weightMachine;
    }



    @Override
    public double getWeightInKg(){
        /**
         *
         * Adapter Adapts the adaptees
         */
        double weightInPound = weightMachine.getWeightInPound();
        double weightInKg = weightInPound*.45;
        return weightInKg;
    }
}
