package contacts.commands;

import contacts.ContactApp;

import java.util.Scanner;

public class DeleteCommand extends ExistingRecordCommand {

    public DeleteCommand() {
        super("No records to remove!");
    }

    @Override
    public void doExecute(ContactApp app, Scanner scanner) {
        app.removedSelectedRecord();
        System.out.println("The record removed!");
    }
}
