package designpatterns.structural.composite.with;

import java.util.ArrayList;
import java.util.List;

public class Directory implements FileSystem{

    /**
     * Now we have a parent as File System that is why we will not use Object instead use FileSystem
     */

    String directoryName;
    List<FileSystem> fileSystemList;

    public Directory(String directoryName){
        this.directoryName = directoryName;
        this.fileSystemList = new ArrayList<>();
    }

    public void add(FileSystem fileSystem){
        fileSystemList.add(fileSystem);
    }

    public void ls(){
        System.out.println("Directory name "+directoryName);
        for(FileSystem fileSystem: fileSystemList){
            fileSystem.ls();
            /**
             * No need to check instances
             */
        }
    }
}
