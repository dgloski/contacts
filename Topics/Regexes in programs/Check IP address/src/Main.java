import java.util.Scanner;
import java.util.regex.Pattern;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //String expression = "(\\d|1\\d\\d|2[0-4]\\d|25[0-5])\\.(\\d|1\\d\\d|2[0-4]\\d|25[0-5])\\.(\\d|1\\d\\d|2[0-4]\\d|25[0-5])\\.(\\d|1\\d\\d|2[0-4]\\d|25[0-5])";
        String expression = "^(([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.){3}([01]?\\d\\d?|2[0-4]\\d|25[0-5])$";
        var pattern = Pattern.compile(expression);
        var matcher = pattern.matcher(scanner.nextLine());
        System.out.println(matcher.matches()?"YES":"NO");
        // start coding here

    }
}
