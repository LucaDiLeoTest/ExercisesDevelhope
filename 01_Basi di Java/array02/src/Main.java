import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        String[] aliceToDos = new String[]{"Coding", "Reading", "Learning"};
        String[] bobToDos = new String[]{"Reading", "Coding", "Learning", "Sleeping"};
        String[] timToDos = new String[]{"Reading", "Learning", "Coding"};

        System.out.println(aliceToDos.equals(bobToDos));
        System.out.println(aliceToDos.equals(timToDos));
        System.out.println(aliceToDos.length == bobToDos.length);
        System.out.println(aliceToDos.length == timToDos.length);
        //sorting the arrays
        Arrays.sort(aliceToDos);
        Arrays.sort(bobToDos);
        Arrays.sort(timToDos);
        //checking if arrays have the same tasks
        System.out.println(Arrays.equals(aliceToDos, bobToDos));
        System.out.println(Arrays.equals(aliceToDos, timToDos));
    }
}