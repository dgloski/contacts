import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String regex = "^(0|([+\\-])?[1-9]+\\d*)|([+\\-]?0?[1-9]*[,.](0|\\d*0?\\d*[1-9]+))$";

        String[] nrs = new String[]{"+1",
        "-1" ,
        "1"  ,
        "123"  ,
        "+12376352189432535347623423443417,36817231873134176345178234234234234"  ,
        "1000"  ,
        "-0,05"  ,
        "-56,0"  ,
        "-56.0"  ,
        "89989.09",
        "1.1"  ,
        "1,01"  ,
        "0"  ,
        "no no no",
        "0123"  ,
        "001"  ,
        "001,003"  ,
        "-23.230"  ,
        "1.10"  ,
        "1,010"  ,
        "+-1"};
        for (String nr : nrs) {
         //   System.out.println(nr.matches(regex) ? "YES " + nr : "NO " + nr);
        }
        String number = scanner.nextLine();
        System.out.println(number.matches(regex) ? "YES" : "NO");
    }
}
