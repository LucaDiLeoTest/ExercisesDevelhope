import java.time.LocalDate;
import static java.time.temporal.ChronoUnit.DAYS;
public class Main {
    public static void main(String[] args) {
        //calculating the days till the end of the month using the DAYS method between()
        LocalDate today = LocalDate.now();
        LocalDate endOfMonth = today.withDayOfMonth(today.lengthOfMonth());
        long daysBetween = DAYS.between(today, endOfMonth);
        System.out.println(daysBetween);
        //calculating the days till the end of the year
        LocalDate endOfYear = today.withDayOfYear(today.lengthOfYear());
        long daysBetweenYear = DAYS.between(today, endOfYear);
        System.out.println(daysBetweenYear);
    }
}