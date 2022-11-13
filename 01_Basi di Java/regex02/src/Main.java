public class Main {
    public static void main(String[] args) {
        String string = "tup tuup tuuup tuuuup";
        System.out.println(string.replaceAll("u{2,3}","x"));
    }
}