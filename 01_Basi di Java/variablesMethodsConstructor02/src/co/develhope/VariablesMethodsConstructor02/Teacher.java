package co.develhope.VariablesMethodsConstructor02;

public class Teacher {
    public String teacherName;
    public Teacher(){
        System.out.println("A new Teacher [object] has been created!");
    }

    /**
     * Method that defines the teacher's ability to assign grades
     * @param alum  Student object
     * @param finalGrade    integer that define grade
     * @return an integer that is the final grade
     */
    public int assignGrade(Student alum,int finalGrade){
        return alum.grade = finalGrade;
    }
}
