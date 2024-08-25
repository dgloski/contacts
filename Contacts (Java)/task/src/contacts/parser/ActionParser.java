package contacts.parser;

import contacts.commands.ActionType;

import java.util.Objects;

public class ActionParser {

    private ActionParser() {
        // Since Utility
    }

    public static ActionType parse(String action) throws InvalidValueException {
        if (Objects.toString(action, "").isEmpty()) {
            throw new InvalidValueException("Invalid action!");
        }
        try {
            return ActionType.valueOf(action.toUpperCase());
        } catch (IllegalArgumentException e) {
            throw new InvalidValueException("Invalid action!");
        }

    }
}
