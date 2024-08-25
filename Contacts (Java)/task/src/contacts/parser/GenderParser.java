package contacts.parser;

import contacts.model.Gender;

import java.util.Objects;

public class GenderParser {

    private GenderParser() {
        // Since Utility
    }

    public static Gender parse(String gender)  {
        if (Objects.toString(gender, "").isEmpty()) {
            System.out.println("Bad gender!");
            return null;
        }
        try {
            return Gender.valueOf(gender.toUpperCase());
        } catch (IllegalArgumentException e) {
            System.out.println("Bad gender!");
            return null;
        }

    }
}
