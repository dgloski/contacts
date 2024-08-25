import java.time.LocalDate;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        try(Scanner scanner = new Scanner(System.in)) {
            var date = LocalDate.parse(scanner.nextLine());
            System.out.println(date.plusWeeks(2));
        }
    }
}
