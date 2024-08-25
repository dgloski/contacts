package contacts.commands;

import contacts.ContactApp;
import contacts.MenuType;

import java.util.Scanner;

public class InfoCommand extends ExistingRecordCommand {

    public InfoCommand() {
        super("No records found!");
    }

    @Override
    public void doExecute(ContactApp app, Scanner scanner) {
        var record = app.getSelectedRecord();
        record.print();
    }

    @Override
    public MenuType getMenu() {
        return MenuType.RECORD;
    }
}
