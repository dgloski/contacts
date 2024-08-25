import java.util.*;
import java.util.regex.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String part = scanner.nextLine();
        String line = scanner.nextLine();

        part = (part+".*|.*"+part+"$").toLowerCase();
        Pattern mypattern = Pattern.compile(part);

        String[] words = line.toLowerCase().split("\\W");
        boolean found = false;
        for (String word : words) {
            Matcher mymatcher= mypattern.matcher(word);
            if (mymatcher.matches()) {
                found = true;
                break;
            }
        }
        System.out.println(found ? "YES" : "NO");
    }
}
