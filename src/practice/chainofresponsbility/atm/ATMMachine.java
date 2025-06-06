package practice.chainofresponsbility.atm;

import java.util.HashMap;
import java.util.Map;

public class ATMMachine {
    State state;
    Map<Integer,Integer> counter;
    int total;

    ATMMachine(){
        state = new IdleState();
        counter = new HashMap<>();
        total = 0;
    }

    public void currentStatus(){
        System.out.println("Total Balance "+total);
        for(Map.Entry<Integer,Integer> entry:counter.entrySet()){
            System.out.println("Denomination: "+entry.getKey()+" of "+entry.getValue());
        }
    }

    public State getState() {
        return state;
    }

    public int getCounts(int bill){
        return counter.get(bill);
    }

    public void setState(State state) {
        this.state = state;
    }

    public void deductHundred(int amount){
        counter.put(100,counter.get(100)-amount);
        total = total - 100*amount;
    }

    public void deductThousand(int amount){
        counter.put(1000,counter.get(1000)-amount);
        total = total - 1000*amount;
    }

    public void deductTen(int amount){
        counter.put(10,counter.get(10)-amount);
        total = total - 10*amount;
    }

    public void addHundred(int amount){
        counter.putIfAbsent(100,counter.getOrDefault(100,0)+amount);
        total = total + 100*amount;
    }

    public void addThousand(int amount){
        counter.putIfAbsent(1000,counter.getOrDefault(1000,0)+amount);
        total = total + 1000*amount;
    }

    public void addTen(int amount){
        counter.putIfAbsent(10,counter.getOrDefault(10,0)+amount);
        total = total + 10*amount;
    }

}
