package co.develhope.classesAndObjects02;

public class Competition {
    public static void main(String [] args){
        System.out.println("Competition's Rules are: ");
        CompetitionRules.printRules();

        Team teamA = new Team();
        teamA.teamName = "Better Team Win";

        teamA.p1.name = "Marco";
        teamA.p1.programmingLanguage = "Javascript";
        teamA.p1.yearsOfExperience = 10;

        teamA.p2.name = "Francesca";
        teamA.p2.programmingLanguage = "Java";
        teamA.p2.yearsOfExperience = 20;

        Team teamB = new Team();
        teamB.teamName = "Last but not least";

        teamB.p1.name = "Giulia";
        teamB.p1.programmingLanguage = "Piton";
        teamB.p1.yearsOfExperience = 8;

        teamB.p2.name = "Roberto";
        teamB.p2.programmingLanguage = "Php";
        teamB.p2.yearsOfExperience = 15;

        teamA.printTeamDetails();
        teamB.printTeamDetails();

    }
}
