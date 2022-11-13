import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        String[] cities = new String[]{"Palermo", "Roma", "Torino"};
        List<String> cityNames = Arrays.asList(cities);

        /*to accomplish my task and add the 4th city in the list i have to proceed using:
        * cityNames.add(3,"Firenze");
        *but because my List<String> cityNames it's the Array cities we can't modify it */

        cityNames.set(1, "Tegucigalpa");
        System.out.println(cityNames);

        List<String> kingsOfRome = new ArrayList<>();
        kingsOfRome.add("Romolo");
        kingsOfRome.add("Numa Pompilio");
        kingsOfRome.add("Tullo Ostilio");
        kingsOfRome.add(" Anco Marco");
        kingsOfRome.add(" Tarquinio Prisco");
        kingsOfRome.add("Servio Tullio");
        kingsOfRome.add("Tarquinio il Superbo");
        System.out.println(kingsOfRome);

        String[] kingsOfRomeArray = kingsOfRome.toArray(new String[0]);//convert the List in an Array
        kingsOfRomeArray[6] = "Lucius Tarquinius Supercar";
        System.out.println(Arrays.toString(kingsOfRomeArray));
    }
}