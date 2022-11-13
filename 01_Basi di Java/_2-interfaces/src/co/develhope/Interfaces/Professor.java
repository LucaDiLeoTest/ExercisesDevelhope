package co.develhope.Interfaces;

public class Professor extends CollegePerson implements ITeachingPerson{

    public String teachingSubject;
    Professor(String name, String surname, int id, String subject){
        this.name = name;
        this.surname = surname;
        this.collegeId = id;
        this.teachingSubject = subject;
    }

    /**
     * Override interface's method with an informative message
     */
    @Override
    public void teachToOtherPeople(){
        System.out.println("Teaching a subject!");
    }

}
