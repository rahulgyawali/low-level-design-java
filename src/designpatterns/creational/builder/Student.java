package designpatterns.creational.builder;

public class Student {

    int rollNumber;                     //Mandatory
    int age;                            //Optional
    String name;                        //Optional
    String fatherName;                  //Optional
    String motherName;                  //Optional
    String mobileNumber;                //Optional

    public Student(StudentBuilder studentBuilder){
        this.rollNumber = studentBuilder.rollNumber;
        this.age = studentBuilder.age;
        this.name = studentBuilder.name;
        this.fatherName = studentBuilder.fatherName;
        this.motherName = studentBuilder.motherName;
        this.mobileNumber = studentBuilder.mobileNumber;
    }

    public String toString(){
        return this.mobileNumber+" "+this.rollNumber+" "+this.name+" "+this.fatherName+" "+this.motherName;
    }

}
