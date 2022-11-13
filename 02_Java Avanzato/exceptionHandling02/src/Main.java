import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        try {
            System.out.println("insert an integer as dividend: ");
            int dividend = scanner.nextInt();
            System.out.println("insert an integer as divisor: ");
            int divisor = scanner.nextInt();
            scanner.close();
            System.out.println("result is: " + dividend / divisor);
        }catch(ArithmeticException e){
            e.printStackTrace();
            System.out.println("divisor can't be 0");
        }
    }
}