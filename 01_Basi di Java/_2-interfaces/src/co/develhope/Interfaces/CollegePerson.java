package co.develhope.Interfaces;

public class CollegePerson {
    public String name, surname;
    public int collegeId;


    /**
     * This method goToCollege() print the user details.
     */
    public void goToCollege(){
        System.out.printf("User: %s %s ID:%s %n",name, surname, collegeId);
    }
}
