public class Main {
    public static void main(String[] args) {
        System.out.println( 2 <= 2 && !true);
        System.out.println(!false && 3>2);
        System.out.println(!( !false|| true));
        System.out.println(6 > 6 ^ !(true && true));
    }
}