import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Date {

    public static void main(String[] args) {
        try (Scanner scn = new Scanner(System.in)) {
            String date = scn.nextLine();
            String dateRegex = "^((19|20)\\d{2}[ -\\/\\. ](0[1-9]|1[0,1,2])[-\\/\\. ](0[1-9]|[12][0-9]|3[01])|(0[1-9]|[12][0-9]|3[01])[-\\/\\. ](0[1-9]|1[0,1,2])[-\\/\\. ](19|20)\\d{2})$";
            Pattern datePattern = Pattern.compile(dateRegex);
            Matcher dateMatcher = datePattern.matcher(date);
            System.out.println(dateMatcher.matches() ? "Yes" : "No");
        }
    }
}
