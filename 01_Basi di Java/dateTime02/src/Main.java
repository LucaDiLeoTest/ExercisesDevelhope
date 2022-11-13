import java.time.*;
import java.time.format.DateTimeFormatter;
import static java.time.format.DateTimeFormatter.ISO_ZONED_DATE_TIME;
public class Main {
    public static void main(String[] args) {
        /*initializing local variable today and printing following
        format1's pattern, that is established by the exercises*/
        LocalDateTime today = LocalDateTime.now();
        DateTimeFormatter format1 = DateTimeFormatter.ofPattern("dd/MMMM/yy HH:mm");
        System.out.println("Current date with custom format: " + today.format(format1));

        /* using the constant ISO_ZONED_DATE_TIME from his package to print
        the current date in the ISO zoned format */
        ZonedDateTime todayZoned = ZonedDateTime.now();
        System.out.println("Current date with ISO zoned format: " + todayZoned.format(ISO_ZONED_DATE_TIME));
    }
}