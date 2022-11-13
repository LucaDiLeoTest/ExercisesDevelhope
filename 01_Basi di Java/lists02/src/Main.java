import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        List<Integer> divisorOf52 = new ArrayList<>();
        //using a for cycle to find the divisor of 52 and add them to the List
        for(int i = 1; i<=52; i++){
            if(52%i == 0){divisorOf52.add(i);}
        }

        List<Integer> randomNumbers = new ArrayList<>();
        randomNumbers.add(1);
        randomNumbers.add(60);
        randomNumbers.add(13);
        randomNumbers.add(12);

        randomNumbers.addAll(divisorOf52); //adding elements of divisorOf52 to randomNumbers

        System.out.println(randomNumbers);
        System.out.println("Item inside randomNumbers: " + randomNumbers.size());






    }
}