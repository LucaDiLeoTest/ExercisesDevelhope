public class Main {
    public static void main(String[] args) {
        String veryLongString = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";
        //Check if correctly past all the info in the String
        System.out.println("-check: are 'um' characters present in the string? " + veryLongString.contains("um"));
        System.out.println("-check: are 'aliquip' characters present in the string? "+ veryLongString.contains("aliquip"));
        System.out.println("-check: are 'est' characters present in the string? " + veryLongString.contains("est"));

        //Replacing stuff in the string...
        veryLongString.replaceAll("um", "HUM");

        //Split veryLongString and assign to a new String[]
        String[] splitVeryLongStringArray  = veryLongString.split("aliquip");
        String sub1 = splitVeryLongStringArray[0];
        String sub2 = splitVeryLongStringArray[1];

        //Clearing the whitespace at the start and end of string
        System.out.println("---Cleaning sub1 using trim() method");
        System.out.println(sub1.trim());
        System.out.println("---Cleaning sub2 using trim() method");
        System.out.println(sub2.trim());

        //Searching "est" in sub1 and sub2
        //print the result
        System.out.println("-task: is 'est' contained in sub1? " + sub1.contains("est"));
        System.out.println("-task: is 'est' contained in sub2? " + sub2.contains("est"));
    }
}