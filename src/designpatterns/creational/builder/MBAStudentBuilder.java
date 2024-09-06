package designpatterns.creational.builder;

import java.util.ArrayList;
import java.util.List;

public class MBAStudentBuilder extends StudentBuilder{

    @Override
    public  StudentBuilder setSubjects(){
        List<String> subs = new ArrayList<>();
        subs.add("Economics");
        subs.add("Marketing");
        this.subjects = subs;
        return this;
    }

}
