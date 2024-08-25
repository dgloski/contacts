package contacts.commands;

import contacts.ContactApp;
import contacts.MenuType;

import java.util.Scanner;

public interface Command {
    Command execute(ContactApp app, Scanner scanner) throws CommandException;

    default MenuType getMenu() {
        return MenuType.MENU;
    }
}
