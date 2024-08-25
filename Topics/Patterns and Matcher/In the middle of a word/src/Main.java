import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String part = scanner.nextLine();
        String line = scanner.nextLine();

        // write your code here
        String expression = "\\B"+part.toLowerCase()+"\\B";
        String matchingLine = line.toLowerCase();
        Pattern pattern = Pattern.compile(expression);
        var matcher = pattern.matcher(matchingLine);
        System.out.println(matcher.find() ? "YES" : "NO");
    }
}
