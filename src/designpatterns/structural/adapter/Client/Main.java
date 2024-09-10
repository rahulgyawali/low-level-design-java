package designpatterns.structural.adapter.Client;

import designpatterns.structural.adapter.Adaptee.WeightMachineForBabies;
import designpatterns.structural.adapter.Adapter.WeightMachineAdapter;
import designpatterns.structural.adapter.Adapter.WeightMachineAdapterImpl;

public class Main {

    public static void main(String[] args) {
        WeightMachineAdapter weightMachineAdapter = new WeightMachineAdapterImpl(new WeightMachineForBabies());
        System.out.println(weightMachineAdapter.getWeightInKg());
    }

}
