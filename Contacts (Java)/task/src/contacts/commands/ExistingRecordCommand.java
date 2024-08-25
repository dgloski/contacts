package contacts.commands;

import contacts.ContactApp;

import java.util.Scanner;

public abstract class ExistingRecordCommand implements Command {

    private final String emptyRecordsMessage;

    protected ExistingRecordCommand(String emptyRecordsMessage) {
        this.emptyRecordsMessage = emptyRecordsMessage;
    }

    abstract protected void doExecute(ContactApp app, Scanner scanner);

    @Override
    public Command execute(ContactApp app, Scanner scanner) throws CommandException {
        try {
            new ListCommand().execute(app, scanner);
            doExecute(app, scanner);
            return null;
        } catch (CommandException e) {
            throw new CommandException(emptyRecordsMessage);
        }
    }
}
