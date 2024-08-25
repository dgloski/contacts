package contacts;

import contacts.commands.Command;
import contacts.commands.CommandBuilder;
import contacts.commands.CommandException;
import contacts.commands.InfoCommand;
import contacts.parser.ActionParser;
import contacts.parser.InvalidValueException;

import java.util.Optional;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        var app = new ContactApp(buildRecordStore(args));
        var navigator = new Navigator();

        try (Scanner scanner = new Scanner(System.in)) {
            navigator.printUsage();
            while (scanner.hasNextLine()) {
                String action = scanner.nextLine();
                try {
                    Command command;
                    try {
                        command = CommandBuilder.buildCommand(ActionParser.parse(action));
                    } catch (InvalidValueException e) {
                        try {
                            var idx = Integer.parseInt(action);
                            app.setSelectedIndex(idx);
                            command = new InfoCommand();
                        } catch (NumberFormatException ex2) {
                            throw e;
                        }
                    }
                    navigator.setCurrentMenu(command.getMenu());
                    while (command != null) {
                        navigator.setCurrentMenu(command.getMenu());
                        command = command.execute(app, scanner);
                    }
                } catch (CommandException | InvalidValueException ex) {
                    System.out.println(ex.getMessage());
                    navigator.setCurrentMenu(MenuType.MENU);
                }
                System.out.println();
                navigator.printUsage();
            }
        }
    }

    private static RecordStore buildRecordStore(String[] args) {
        if (args.length == 1) {
            var filename = args[0];
            System.out.printf("open %s%n%n", filename);
            return new FileRecordStore(filename);
        } else {
            return new TransientRecordStore();
        }
    }
}
