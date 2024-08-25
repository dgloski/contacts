package contacts.commands;

import contacts.ContactApp;

import java.util.Scanner;

public class CountCommand implements Command {

    @Override
    public Command execute(ContactApp app, Scanner scanner) {
        System.out.printf("The Phone Book has %d records.%n", app.getRecords().size());
        return null;
    }
}
