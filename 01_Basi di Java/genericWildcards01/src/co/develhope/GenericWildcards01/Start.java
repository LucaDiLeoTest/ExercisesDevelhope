package co.develhope.GenericWildcards01;

import java.util.ArrayList;
import java.util.List;

public class Start {
    public static void main(String[] args) {

        List<Double> individualMarksListLisa = new ArrayList<>();
        individualMarksListLisa.add(0, 2.14);
        individualMarksListLisa.add(1, 3.05);

        List<Integer> projectMarksListJeremy = new ArrayList<>();
        projectMarksListJeremy.add(0, 1);
        projectMarksListJeremy.add(1, 56);

        double lisaAvg = Student.getAverageMark(individualMarksListLisa);
        double jeremyAvg = Student.getAverageMark(projectMarksListJeremy);

        List<Student> listOfStudents = new ArrayList<>();
        listOfStudents.add(new Student("Lisa", "Stuart", lisaAvg));
        listOfStudents.add(new Student("Jeremy", "Green", jeremyAvg));

        System.out.println(listOfStudents.get(0).toString());
        System.out.println(listOfStudents.get(1).toString());


    }
}