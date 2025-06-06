package practice.chainofresponsbility.atm;

import java.util.*;

public class MoneyManager {
    public static MoneyManager moneyManager;
    public static Map<Money,Integer> moneyMap;
    private MoneyManager(){
        moneyMap = new HashMap<>();
    }

    public MoneyManager getMoneyManager(){
        if(moneyManager == null){
            moneyManager = new MoneyManager();
        }
        return moneyManager;
    }

    public void addMoney(Money money){
        moneyMap.putIfAbsent(money,moneyMap.getOrDefault(money,0)+1);
    }

    public void removeMoney(Money money){
        moneyMap.put(money,moneyMap.get(money)-1);
    }
}
