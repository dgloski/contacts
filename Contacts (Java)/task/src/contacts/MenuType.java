package contacts;

public enum MenuType {

    MENU("Enter action (add, list, search, count, exit):"),
    SEARCH("Enter action ([number], back, again):"),
    RECORD("Enter action (edit, delete, menu):"),
    LIST("Enter action ([number], back):");

    MenuType(String usage) {
        this.usage = usage;
    }

    private String usage;

    public String getUsage() {
        return usage;
    }
}
