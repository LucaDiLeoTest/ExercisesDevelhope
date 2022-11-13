import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome!");
        int number;
        int input;
        do {System.out.println("digit a number between 1 and 10: ");
            number = (int) Math.floor(Math.random()*(10-1+1)+1);
            input = scanner.nextInt();
        }while(number != input);
        //exit condition(when the user find the correct number)
        System.out.println("Congratulations!");
        scanner.close();
    }
}