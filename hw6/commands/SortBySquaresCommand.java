package commands;

import collection.FiguresCollection;
import commands.base.CommandBase;
import commands.parameters.base.CommandParameter;

public class SortBySquaresCommand extends CommandBase {
    public SortBySquaresCommand(FiguresCollection figuresCollection) {
        super(figuresCollection);
    }

    @Override
    public void execute(CommandParameter parameter) {
        super.execute(parameter);

        figuresCollection.sortBySquare();
        figuresCollection.getAllSquares();
    }
}
