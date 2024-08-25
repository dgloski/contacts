import java.time.LocalDate;
import java.time.temporal.TemporalUnit;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        try(var scanner = new Scanner(System.in)) {
            // 2017-06-03
            var date = LocalDate.parse(scanner.nextLine());
            System.out.println(date.minusYears(30));
            System.out.println(date.plusYears(30));
        }
    }
}
