import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = "";
        //use the while loop to give the user the possibility to insert input except stop
        while(!input.equals("stop")){
        System.out.println("Please enter a command ");
        input = scanner.nextLine();
        System.out.println(input);
        }
    }
}