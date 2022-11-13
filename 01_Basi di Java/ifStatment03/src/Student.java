import java.util.Random;
public class Student {
    public String name;
    public int age;

    public Student(String studentName, int studentAge){
        this.name = studentName;
        this.age = studentAge;
    }

    public void guessingAge(){
        Random random = new Random();
        int randomNumber = random.nextInt(35);
        System.out.println("I generated the random number " + randomNumber + " for student" + name);
        if(randomNumber == age){
            System.out.println("the random number is equal to the student's age");
        }else if(randomNumber < age){
            System.out.println("the random number is lower than the student's age");
        }else{
            System.out.println("the random number is greater than the student's age");
        }
    }
}
