import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> list = new ArrayList<>();
        System.out.println("insert a string: ");
        String input;

        while(true){
            input = scanner.nextLine();
        switch(input) {
            case "size":
                System.out.println(list.size());
                break;
            case "clear":
                list.removeAll(list);
                break;
            case "print":
                System.out.println(Arrays.toString(list.toArray()));
                break;
            default:
                list.add(input);

            }
        }
    }
}