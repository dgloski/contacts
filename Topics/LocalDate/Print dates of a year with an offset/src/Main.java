import java.time.LocalDate;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        try (Scanner scanner = new Scanner(System.in)) {
            var date = LocalDate.parse(scanner.nextLine());
            int inc = scanner.nextInt();
            int currentYear = date.getYear();
            do {
                System.out.println(date);
                date = date.plusDays(inc);
            } while ((date.getYear() == currentYear));
        }
    }
}
