package designpatterns.creational.builder;

public class BuilderPattern {

    public class Student{

        int rollNumber;                     //Mandatory
        int age;                            //Optional
        String name;                        //Optional
        String fatherName;                  //Optional
        String motherName;                  //Optional
        String mobileNumber;                //Optional

        /**
         * How to create objects? More specifically how to make a constructor with so many optional attributes?
         */

        /**
         * Option 1
         */
        public Student(int rollNumber, int age, String name, String fatherName, String motherName, String mobileNumber){
            this.rollNumber = rollNumber;
            this.age =  age;
            this.name =  name;
            this.fatherName = fatherName;
            this.motherName = motherName;
            this.mobileNumber = mobileNumber;
        }

        /**
         * Option 2
         */

        //Too many constructors with different arguments
        
    }

}
