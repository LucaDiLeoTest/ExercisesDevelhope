public class Main {
    public static void main(String[] args) {
        String string1 = "Hello";
        String string2 = "How are you?";

        String subString1 = string1.substring(0, 2);

        String subString2 = string2.substring(10);

        char[] charArray = new char[4];
        String subString = subString1 + subString2;
        charArray[0] = subString.charAt(0);
        charArray[1] = subString.charAt(1);
        charArray[2] = subString.charAt(2);
        charArray[3] = subString.charAt(3);
        System.out.println(charArray);
    }
}