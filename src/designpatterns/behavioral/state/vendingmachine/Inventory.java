package designpatterns.behavioral.state.vendingmachine;

import java.util.ArrayList;
import java.util.List;

public class Inventory {
    List<ItemShelf> itemShelfList;
    public Inventory(){
        this.itemShelfList = new ArrayList<>();
    }

    public Item getItemByCode(int codeNumber){
        for(ItemShelf itemShelf: itemShelfList){
            if(itemShelf.getCode() == codeNumber){
                return itemShelf.getItem();
            }
        }
        return null;
    }
}
