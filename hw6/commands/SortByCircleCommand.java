package commands;

import collection.FiguresCollection;
import commands.base.CommandBase;
import commands.parameters.base.CommandParameter;

public class SortByCircleCommand extends CommandBase {
    public SortByCircleCommand(FiguresCollection figuresCollection) {
        super(figuresCollection);
    }

    @Override
    public void execute(CommandParameter parameter) {
        super.execute(parameter);

        figuresCollection.sortByCircleLength();
        figuresCollection.getAllCircleLengths();
    }
}
