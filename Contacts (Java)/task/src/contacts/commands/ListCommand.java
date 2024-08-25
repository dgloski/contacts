package contacts.commands;

import contacts.ContactApp;
import contacts.model.Record;

import java.util.List;
import java.util.Scanner;

public class ListCommand implements Command {

    @Override
    public Command execute(ContactApp app, Scanner scanner) throws CommandException {
        int count = 0;
        List<Record> records = app.getRecords();
        for (Record record : records) {
            System.out.printf("%d. %s%n", ++count, record.getDisplayName());
        }
        if (records.isEmpty()) {
            throw new CommandException("No records to be listed!");
        }
        return null;
    }
}
