import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String stringWithNumbers = scanner.nextLine();

        // write your code here
        String expression = "\\b([1-9]\\d{9,})\\b";
        Pattern pattern = Pattern.compile(expression);
        Matcher matcher = pattern.matcher(stringWithNumbers);
        while (matcher.find()) {
            System.out.println(matcher.group()+":"+matcher.group().length());
        }
    }
}
