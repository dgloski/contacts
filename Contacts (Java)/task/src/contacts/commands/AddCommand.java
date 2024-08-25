package contacts.commands;

import contacts.ContactApp;
import contacts.model.Record;
import contacts.model.RecordTypes;

import java.util.Scanner;

public class AddCommand implements Command {

    @Override
    public Command execute(ContactApp app, Scanner scanner) {

        System.out.println("Enter the type (person, organization):");
        var type = RecordTypes.valueOf(scanner.nextLine().toUpperCase());
        RecordBuilder builder;
        if (type == RecordTypes.PERSON) {
            builder = new PersonBuilder();
        } else if (type == RecordTypes.ORGANIZATION) {
            builder = new OrganisationBuilder();

        } else {
            throw new IllegalArgumentException("Invalid type " + type);
        }

        Record record = builder.build(scanner);
        app.addRecord(record);
        System.out.println("The record added.");
        return null;
    }
}
