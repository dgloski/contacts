import java.time.LocalDate;
import java.time.Month;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        try(Scanner scanner = new Scanner(System.in)) {
            int year = scanner.nextInt();
            int dayinyear = scanner.nextInt();
            var date = LocalDate.of(year, 1, 1);
            //System.out.println(date);
            date = date.plusDays(--dayinyear);
            //System.out.println(date);

            var xxx = date.plusMonths(1).withDayOfMonth(1).minusDays(1).getDayOfMonth();
            var yyy = date.getDayOfMonth();
            System.out.println(xxx == yyy);
        }
    }
}
