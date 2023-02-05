package commands;

import collection.FiguresCollection;
import commands.base.CommandBase;
import commands.parameters.base.CommandParameter;
import user.ConsoleView;

public class ExitCommand extends CommandBase {
    public ExitCommand(FiguresCollection figuresCollection) {
        super(figuresCollection);
    }

    @Override
    public void execute(CommandParameter parameter) {
        super.execute(parameter);
        ConsoleView.exitFromProgram();
    }
}
