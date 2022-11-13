package co.develhope.GenericWildcards01;

import java.util.List;

public class Student {
    public String studentName;
    public String studentSurname;
    public double marksAverage;
    //Constructor
    Student(String name, String surname, double average){
        this.studentName = name;
        this.studentSurname = surname;
        this.marksAverage = average;
    }

    /**
     * This method calculate the average
     * @param listOfMarks it's a list of number
     * @return the average value as a double
     */
    public static double getAverageMark(List<? extends Number> listOfMarks){
        return (listOfMarks.get(0).doubleValue() + listOfMarks.get(1).doubleValue())/2;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentName='" + studentName + '\'' +
                ", studentSurname='" + studentSurname + '\'' +
                ", marksAverage=" + marksAverage +
                '}';
    }
}
