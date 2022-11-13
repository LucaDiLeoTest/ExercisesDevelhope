import entities.Person;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        Scanner scanner = new Scanner(System.in);
        //User setting attributes
        System.out.println("What's your name?");
        person.setName(scanner.nextLine());
        System.out.println("What's your surname?");
        person.setSurname(scanner.nextLine());
        System.out.println("What's your height?");
        person.setHeight(scanner.nextDouble());
        System.out.println("How old are you?");
        person.setAge(scanner.nextInt());
        scanner.close();
        //Printing person details
        System.out.println("Hello " + person.getName() + " " + person.getSurname() + " you are height " +
                +person.getHeight() + " you are " + person.getAge() + " old,nice to meet you!");

    }
}