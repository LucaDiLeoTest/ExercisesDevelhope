public class Main {
    public static void main(String[] args) {
        System.out.println((55 != 55) && (false ^ true));
        System.out.println((!true || !false) || 2 == '2');
        System.out.println(false && true || false &&false);
        System.out.println((false && true) || (false || true));
    }
}