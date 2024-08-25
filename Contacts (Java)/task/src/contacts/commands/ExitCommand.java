package contacts.commands;

import contacts.ContactApp;

import java.io.IOException;
import java.util.Scanner;

public class ExitCommand implements Command {

    @Override
    public Command execute(ContactApp app, Scanner scanner) {
        try {
            app.saveRecords();
            System.exit(0);
            return null;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
