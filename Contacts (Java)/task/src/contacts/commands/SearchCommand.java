package contacts.commands;

import contacts.ContactApp;
import contacts.MenuType;
import contacts.model.Record;

import java.util.List;
import java.util.Scanner;

public class SearchCommand implements Command {

    @Override
    public Command execute(ContactApp app, Scanner scanner) {
        System.out.printf("Enter search query:%n");
        String query = scanner.nextLine().toLowerCase();
        List<Record> records = app.getRecords().stream()
            .filter(record -> record.getDisplayName().toLowerCase().contains(query) ||
                record.getPhonenumber().toLowerCase().contains(query)).toList();
        if (records.isEmpty()) {
            System.out.print("No records to be listed!");
        } else {
            int count = 0;
            System.out.printf("Found %d results:%n", records.size());
            for (Record record : records) {
                System.out.printf("%d. %s%n", ++count, record.getDisplayName());
            }
        }
        return null;
    }

    public MenuType getMenu() {
        return MenuType.SEARCH;
    }
}
