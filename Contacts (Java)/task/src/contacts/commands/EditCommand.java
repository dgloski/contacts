package contacts.commands;

import contacts.ContactApp;
import contacts.MenuType;

import java.util.Scanner;

public class EditCommand extends ExistingRecordCommand {

    public EditCommand() {
        super("No records to edit!");
    }

    @Override
    public void doExecute(ContactApp app, Scanner scanner) {
        var record = app.getSelectedRecord();
        System.out.printf("Select a field (%s):%n", String.join(", ", record.getEditableFields()));
        String field = scanner.nextLine();
        System.out.printf("Enter %s:%n", field);
        String value = scanner.nextLine();

        record.updateFieldValue(field, value);

        record.updated();
        System.out.println("The record updated!");
    }

    @Override
    public MenuType getMenu() {
        return MenuType.RECORD;
    }
}
