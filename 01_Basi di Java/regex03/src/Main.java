public class Main {
    public static void main(String[] args) {
        String string = "are you able to climb, are you able to swim or are you able to fly?";
        System.out.println(string.replaceAll("( are)", "_XYZ"));
    }
}