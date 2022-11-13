package co.develhope.classesAndObjects02;

public class Team {
    public String teamName;
    Programmer p1 = new Programmer();
    Programmer p2 = new Programmer();
     public void printTeamDetails() {
        System.out.println(teamName);
        p1.printProgrammerDetails();
        p2.printProgrammerDetails();

    }
}
