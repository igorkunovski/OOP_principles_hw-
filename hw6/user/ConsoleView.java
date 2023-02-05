package user;

public class ConsoleView {

    public static void showMainMenu(){
        System.out.println("----MENU----");
        System.out.println(" Please choose number of command and press Enter");
        System.out.println(" 1. Add new figure to Collection");
        System.out.println(" 2. Remove figure from Collection by number");
        System.out.println(" 3. Show all figures with possible data");
        System.out.println(" 4. Replace figure by index");
        System.out.println(" 5. Sort figures in Collection by Square");
        System.out.println(" 6. Sort figures in Collection by Perimeter where possible");
        System.out.println(" 7. Sort figures in Collection by Circle Length where possible");
        System.out.println(" 8. Show figure possible data");
        System.out.println(" 9. Quit program");
        System.out.println(" ---------------");
    }

    public static void exitFromProgram(){
        System.out.println("----BUY----");
    }
}
