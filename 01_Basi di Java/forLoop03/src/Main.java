import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        String[] arr = new String[]{"monday", "tuesday", "wednesday", "thursday",
                "friday", "saturday", "sunday"};

        for(int i=0; i<arr.length; i+=2){
           arr[i] = arr[i].toUpperCase();
        }
        System.out.println(Arrays.toString(arr));
    }
}