package contacts.commands;

import contacts.model.Organization;
import contacts.model.Record;

import java.util.Scanner;

public final class OrganisationBuilder implements RecordBuilder {

    @Override
    public Record build(Scanner scanner) {
        System.out.println("Enter the organization name:");
        String name = scanner.nextLine();
        System.out.println("Enter the address:");
        String address = scanner.nextLine();
        System.out.println("Enter the number:");
        String number = scanner.nextLine();
        return new Organization(number, name, address);
    }
}
