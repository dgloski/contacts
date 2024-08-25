import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalUnit;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        try(Scanner scanner = new Scanner(System.in)) {
            var year = scanner.nextInt();
            var month = scanner.nextInt();
            var date = LocalDate.of(year, month, 1);
            var currentMonth = date.getMonth();
            var currentYear = date.getMonth();
            while (currentMonth == date.getMonth()) {
                date = date.plusDays(1);
                if (date.getDayOfWeek()  == DayOfWeek.MONDAY
                    && currentMonth == date.getMonth()
                ) {
                    System.out.println(date);
                }
            }
        }
    }
}
