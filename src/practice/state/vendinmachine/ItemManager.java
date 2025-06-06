package practice.state.vendinmachine;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ItemManager {
    Map<Integer,List<Item>> itemMap = new HashMap<>();
    static ItemManager itemManager;

    public static ItemManager getItemManager() {
        if(itemManager == null){
            itemManager = new ItemManager();
        }
        return itemManager;
    }

    public void addItem(int productId,Item item){
        if(!itemMap.containsKey(productId)){
            itemMap.put(productId,new ArrayList<>());
        }
        itemMap.get(productId).add(item);
    }

    public Item removeItem(int productId){
        return itemMap.get(productId).removeLast();
    }

    public Item createItem(int code,int price,String name){
        return new Item(code, price, name);
    }

    public void fill(VendingMachine vendingMachine){
        for(int i = 0; i < 5; i++){
            vendingMachine.getItemManager().addItem(i%3 , new Item(i,i*(i+1),"Item-"+i));
        }
    }

    public void displayInventory(VendingMachine vendingMachine){
        for(Map.Entry<Integer, List<Item>> entry:vendingMachine.getItemManager().itemMap.entrySet()){
            System.out.println("Product Id "+entry.getKey());
            for(Item item: entry.getValue()){
                System.out.println("\t"+item.getCode()+" "+ item.getName()+" "+item.getPrice());
            }
            System.out.println();
        }
    }
}
