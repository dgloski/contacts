package contacts.commands;

import contacts.model.Gender;
import contacts.model.Person;
import contacts.model.Record;
import contacts.parser.BirthDateParser;
import contacts.parser.GenderParser;

import java.time.LocalDate;
import java.util.Scanner;

public final class PersonBuilder implements RecordBuilder {

    @Override
    public Record build(Scanner scanner) {

        System.out.println("Enter the name:");
        String name = scanner.nextLine();
        System.out.println("Enter the surname:");
        String surname = scanner.nextLine();
        System.out.println("Enter the birth date:");
        LocalDate birthDate = BirthDateParser.parse(scanner.nextLine());
        System.out.println("Enter the gender (M, F):");
        Gender gender = GenderParser.parse(scanner.nextLine());

        System.out.println("Enter the number:");
        String number = scanner.nextLine();

        return new Person(number, name, surname, birthDate, gender);
    }
}
