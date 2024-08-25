package contacts.parser;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class PhonenumberValidator {
    private static final String PHONE_NUMBER_PATTERN =
        "^(\\+)?((\\([A-Za-z0-9]{1,}\\)([ -]{1}[A-Za-z0-9]{2,})?)|[A-Za-z0-9]{1,}|([A-Za-z0-9]{1,})([ -]{1}\\([A-Za-z0-9]{2,}\\)))?([ -]{1}[A-Za-z0-9]{2,})*$";
    private static final Pattern PATTERN = Pattern.compile(PHONE_NUMBER_PATTERN);

    private PhonenumberValidator() {
        // Since Utility
    }

    public static void validate(String phonenumber) throws InvalidValueException {
        Matcher matcher = PATTERN.matcher(phonenumber);
        if (!matcher.matches()) {
            throw new InvalidValueException("Wrong number format!");
        }
    }

}
