package co.develhope.Interfaces;

public class Assistant extends CollegePerson implements ILearningPerson,ITeachingPerson{

    boolean isGoingToBeAphD;
    Assistant(String name, String surname, int id, boolean isGoingToBeAphD){
        this.name = name;
        this.surname = surname;
        this.collegeId = id;
        this.isGoingToBeAphD = isGoingToBeAphD;


    }

    /**
     * Override interface's method with an informative message
     */
    @Override
    public void studyAtHome(){}

    /**
     * Override interface's method with an informative message
     */
    @Override
    public void teachToOtherPeople(){}
}
