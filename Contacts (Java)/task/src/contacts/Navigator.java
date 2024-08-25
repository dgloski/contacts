package contacts;


public class Navigator {
    private MenuType currentMenu = MenuType.MENU;

    public void setCurrentMenu(MenuType currentMenu) {
        this.currentMenu = currentMenu;
    }

    public void printUsage() {
        System.out.printf("[%s] %s%n",currentMenu.name().toLowerCase(),currentMenu.getUsage());
    }
}
