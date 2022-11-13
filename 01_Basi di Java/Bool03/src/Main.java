public class Main {
    public static void main(String[] args) {
        System.out.println(!(!(!(false ^ false) || (true && true))));
        System.out.println(!((3 * 2) <= 6) && (3 - 2 != 1));
    }
}