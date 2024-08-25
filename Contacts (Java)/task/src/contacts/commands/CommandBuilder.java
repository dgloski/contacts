package contacts.commands;

public final class CommandBuilder {

    private CommandBuilder() {
        // Since Utility
    }

    public static Command buildCommand(ActionType action) {
        return switch (action) {
            case BACK -> new BackCommand();
            case MENU -> new BackCommand();
            case ADD -> new AddCommand();
            case AGAIN -> new SearchCommand();
            case SEARCH -> new SearchCommand();
            case DELETE -> new DeleteCommand();
            case EDIT -> new EditCommand();
            case COUNT -> new CountCommand();
            case LIST -> new ListCommand();
            case EXIT -> new ExitCommand();
        };
    }
}
