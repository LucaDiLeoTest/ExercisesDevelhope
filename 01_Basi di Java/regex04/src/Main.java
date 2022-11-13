public class Main {
    public static void main(String[] args) {
        String string = " x3z ? xYz ! R1 && __";
        System.out.println(string.replaceAll("\\p{javaLowerCase}", "*"));
    }
}