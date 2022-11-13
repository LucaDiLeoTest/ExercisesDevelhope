package co.develhope.VariablesMethodsConstructor02;

public class Student {
    public String name;
    public int grade;
    public Student(String studentName){
        System.out.println("A new Student [object] has been created!");
        this.name = studentName;
    }
    public void getStudentDetails(){
        System.out.println(name + " " + grade);
    }
}
