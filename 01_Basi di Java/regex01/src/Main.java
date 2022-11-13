public class Main {
    public static void main(String[] args) {
        String string = "I Like to code near the Lake with my friend Luke";
        System.out.println(string.replaceAll( "L[^u]ke", "BLA"));
    }
}