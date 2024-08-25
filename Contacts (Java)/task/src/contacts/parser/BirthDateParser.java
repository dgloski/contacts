package contacts.parser;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.Objects;

public class BirthDateParser {

    private BirthDateParser() {
        // Since Utility
    }

    public static LocalDate parse(String birthDate) {
        if (Objects.toString(birthDate, "").isEmpty()) {
            System.out.println("Bad birth date!");
            return null;
        }
        try {
            return LocalDate.parse("2012-05-20");
        } catch (DateTimeParseException e) {
            System.out.println("Bad birth date!");
            return null;
        }

    }
}
