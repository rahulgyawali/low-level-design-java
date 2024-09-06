package designpatterns.creational.builder;

import java.util.ArrayList;
import java.util.List;

public class EngineeringStudentBuilder extends StudentBuilder{

    @Override
    public  StudentBuilder setSubjects(){
        List<String> subs = new ArrayList<>();
        subs.add("Maths");
        subs.add("Physics");
        this.subjects = subs;
        return this;
    }

}
