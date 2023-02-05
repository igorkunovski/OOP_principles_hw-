package commands;

import collection.FiguresCollection;
import commands.base.CommandBase;
import commands.parameters.base.CommandParameter;


public class SortByPerimetersCommand extends CommandBase {
    public SortByPerimetersCommand(FiguresCollection figuresCollection) {
        super(figuresCollection);
    }

    @Override
    public void execute(CommandParameter parameter) {
        super.execute(parameter);

        figuresCollection.sortByPerimeter();
        figuresCollection.getAllPerimeters();
    }
}
