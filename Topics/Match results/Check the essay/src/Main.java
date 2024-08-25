import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


class FindTheKeys {
    public static void main(String[] args) {
        boolean flag = true;
        boolean verbose = false;


        // write your code here
        String expression = "(the\\s+key\\s+is\\s*((( )[!#?aeiou\\s]+( ))|(( )[\\sb-df-hj-nq-tv-z\\d]+( ))))";
        Pattern pattern = Pattern.compile(expression, Pattern.CASE_INSENSITIVE);
        if (flag) {
            Scanner scanner = new Scanner(System.in);
            String text = scanner.nextLine();
            Matcher matcher = pattern.matcher(text);
            while (matcher.find()) {
                System.out.println(matcher.group(2).trim());
            }
        } else {

            var xxx = new String[]{
                "The    keY    is ????? blabla ",
                "The    keY    is     ggYYY3564   THE    key IS ffFF23c! ",
                "The    key    IS     ggYiYY3564   The    KEY  is     AAAAAaaaa!!!! ",
                "blabla The    key    IS     ggg blabla  The    KEY  is     eeeeeaa blabla The    KEY  is FGH4673846 "
            };

            for (int j = 0; j < xxx.length; j++) {
                var text = xxx[j];
                Matcher matcher = pattern.matcher(text);
                System.out.println("Check text: " + text);
                while (matcher.find()) {
                    if (verbose) {
                        for (int i = 0; i <= matcher.groupCount(); i++) {
                            System.out.println(i + ". \"" + matcher.group(i).trim() + "\"");
                        }
                    } else {
                        System.out.println(matcher.group(2).trim());
                    }
                }
                System.out.println();
            }
        }

    }
}
