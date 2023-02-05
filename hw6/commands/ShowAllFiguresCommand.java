package commands;

import collection.FiguresCollection;
import commands.base.CommandBase;
import commands.parameters.base.CommandParameter;


public class ShowAllFiguresCommand extends CommandBase {

    public ShowAllFiguresCommand(FiguresCollection figuresCollection) {
        super(figuresCollection);
    }

    @Override
    public void execute(CommandParameter parameter) {
        super.execute(parameter);

        figuresCollection.showList();
        figuresCollection.showAllPossibleFiguresData();
    }
}
