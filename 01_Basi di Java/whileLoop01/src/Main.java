import java.util.concurrent.TimeUnit;
public class Main {
    public static void main(String[] args) {
        long timeToSleep = 1L; //set the time to sleep
        TimeUnit time = TimeUnit.SECONDS; //create a TimeUnit Object
        try{
            time.sleep(timeToSleep);//using sleep method
            while(true){
                 System.out.println("I am in loop");
             }
        }catch (InterruptedException exception){
            exception.printStackTrace();// print exception's stack trace

        }
    }
}