package co.develhope.Interfaces;

public class Start {
    public static void main(String[] args){

        Student student = new Student("studName ", "studSurname ", 1, 5);
        student.goToCollege();
        student.studyAtHome();

        Professor professor = new Professor("profName", "profSurname", 901, "History");
        professor.goToCollege();
        professor.teachToOtherPeople();

        Assistant assistant = new Assistant("assistName", "assistSurname", 801, false);
        assistant.goToCollege();
        assistant.studyAtHome();
        assistant.teachToOtherPeople();
    }
}
