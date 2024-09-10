package designpatterns.structural.composite.without;

import java.util.ArrayList;
import java.util.List;

public class Directory {

    String directoryName;
    List<Object> objectList;

    public Directory(String directoryName){
        this.directoryName = directoryName;
        objectList = new ArrayList<>();
    }

    public void add(Object obj){
        objectList.add(obj);
    }

    public void ls(){
        System.out.println("Directory Name "+directoryName);
        for(Object obj: objectList){
            if(obj instanceof File){
                ((File)obj).ls();
            }else if(obj instanceof Directory){
                ((Directory) obj).ls();
            }
        }
    }
}
