package user;

import commands.base.Command;
import config.SupportMethods;
import commands.parameters.base.IndexParameter;

import java.util.Map;


public class UserInterface {

    private final Map<Integer, Command> commands;

    public UserInterface(Map<Integer, Command> commands) {
        this.commands = commands;
    }

    SupportMethods sm = new SupportMethods();

    public void run() {
        int cmd = -1;

        while (!(cmd == 9)){

            ConsoleView.showMainMenu();
            cmd = sm.chooseNumber();

            if (commands.containsKey(cmd)){
                commands.get(cmd).execute(new IndexParameter(cmd));
            } else {
                try {
                    throw new IllegalArgumentException();
                } catch (IllegalArgumentException e) {
                    System.err.println("Incorrect index, try again");
                }
            }
        }
    }
}
