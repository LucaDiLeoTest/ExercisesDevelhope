package co.develhope.Interfaces;

public class Student extends CollegePerson implements ILearningPerson{

    public int academicYear;
    Student(String name, String surname, int id , int year){
        this.name = name;
        this.surname = surname;
        this.collegeId = id;
        this.academicYear = year;
    }

    /**
     * Override interface's method with an informative message
     */
    @Override
    public void studyAtHome() {
        System.out.println("Studing at home!");
    }
}
