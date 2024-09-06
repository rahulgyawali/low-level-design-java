package designpatterns.creational.builder;

/**
 * Director calls Different String Builders in certain order in order to actually build student object
 *
 * Example: We have Engineering Student Builder vs Management Student Builder
 */
public class Director {

    /**
     * Acts as a mediator for different Builders
     */

    StudentBuilder studentBuilder;

    public Director(StudentBuilder studentBuilder){
        this.studentBuilder = studentBuilder;
    }

    public Student createStudent(){
        /**
         * Starts calling Builder of corresponding instances
         */
        if(studentBuilder instanceof EngineeringStudentBuilder){
            return createEngineeringStudent();
        }else if(studentBuilder instanceof MBAStudentBuilder){
            return createMBStudent();
        }
        return null;
    }

    private Student createEngineeringStudent(){
        return studentBuilder.setRollNumber(1).setAge(22).setName("Engineering Student").setSubjects().build();
    }

    private Student createMBStudent(){
        return studentBuilder.setRollNumber(2).setAge(21).setName("MBA Student").setFatherName("F Name").setMotherName("M Name").setSubjects().build();
    }

}
