package designpatterns.creational.builder;

import java.util.List;

/**
 *
 * Disadvantage is that there is code duplication
 *
 */

public abstract class StudentBuilder {
    int rollNumber;                     //Mandatory
    int age;                            //Optional
    String name;                        //Optional
    String fatherName;                  //Optional
    String motherName;                  //Optional
    String mobileNumber;                //Optional
    List<String> subjects;              //Optional

    public StudentBuilder setRollNumber(int rollNumber){
        this.rollNumber = rollNumber;
        return this;
    }

    public StudentBuilder setAge(int age){
        this.age = age;
        return this;
    }

    public StudentBuilder setName(String name){
        this.name = name;
        return this;
    }

    public StudentBuilder setFatherName(String fatherName){
        this.fatherName = fatherName;
        return this;
    }

    public StudentBuilder setMotherName(String motherName){
        this.motherName = motherName;
        return this;
    }

    public StudentBuilder setMobileNumber(String mobileNumber){
        this.mobileNumber = mobileNumber;
        return this;
    }

    public abstract StudentBuilder setSubjects();

    /**
     *
     * Now this will create Student Object from the Student Builder
     */

    public Student build(){
        return new Student(this);
    }



}
