package contacts.commands;

import contacts.model.Record;

import java.util.Scanner;

public interface RecordBuilder {
    Record build(Scanner scanner);
}
