package co.develhope.VariablesMethodsConstructor02;

public class Main {
    public static void main(String[] args){
        Student student1 = new Student("Marco");
        Student student2 = new Student("Giuseppe");
        Teacher teacher = new Teacher();

        teacher.teacherName = "Tommaso";

        teacher.assignGrade(student1,10);
        teacher.assignGrade(student2,7);

        student1.getStudentDetails();
        student2.getStudentDetails();
    }
}
