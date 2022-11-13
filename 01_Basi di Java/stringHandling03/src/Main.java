public class Main {
    public static void main(String[] args) {

        String[] array1 = new String[]{" I want ", " to learn ", " how to code "};
        /**
         * Initializing a new array call array2 that contains in index the trim() method applied to
         * array1's value
         */
        String[] array2 = new String[]{array1[0].trim(), array1[1].trim(),array1[2].trim()};
        //Initializing statement1
        int statement1 = (array2[0]).compareTo("I want");
        //Initializing statement2
        int statement2 = (array2[1]).compareToIgnoreCase("To Learn");
        //Printing the boolean:
        System.out.println(!(statement1 > statement2));

    }
}
