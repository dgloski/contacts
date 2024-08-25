import java.time.LocalDate;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        try(Scanner scanner = new Scanner(System.in)) {
            var year = scanner.nextInt();
            var day1 = scanner.nextInt();
            var day2 = scanner.nextInt();
            var day3 = scanner.nextInt();
            LocalDate day = LocalDate.of(year, 1, 1);
            System.out.println(day.plusDays(--day1));
            System.out.println(day.plusDays(--day2));
            System.out.println(day.plusDays(--day3));
        }
    }
}
