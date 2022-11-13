import entities.House;
import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        House house = new House();
        Scanner scanner = new Scanner(System.in);

        System.out.println("What's your home address? ");
        house.setAddress(scanner.nextLine());

        System.out.println("How many floors your house count?");
        house.setFloorsNumber(scanner.nextInt());
        scanner.nextLine();
        System.out.println("Who are the residents? (please use the comma to separate the residents)");
        house.setResidentsNames(new String[]{scanner.nextLine()});
        scanner.close();

        System.out.println(String.format("You live at address: "+house.getAddress()+" ,house floors: "+house.getFloorsNumber()
                +" ,the residents are: "+ Arrays.toString(house.getResidentsNames())));
    }
}