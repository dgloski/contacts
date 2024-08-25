import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = Integer.parseInt(scanner.nextLine());
        String line = scanner.nextLine();

        // write your code here
        // \b\w{2}\b
        Pattern pattern = Pattern.compile("\\b[A-Za-z]{" + size + "}\\b");
        System.out.println(pattern.matcher(line).find() ? "YES" : "NO");
    }
}
