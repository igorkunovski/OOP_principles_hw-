package commands;

import collection.FiguresCollection;
import commands.base.CommandBase;
import commands.parameters.base.CommandParameter;
import config.SupportMethods;


public class RemoveByIndexCommand extends CommandBase {

    public RemoveByIndexCommand(FiguresCollection figuresCollection) {
        super(figuresCollection);
    }
    SupportMethods sm = new SupportMethods(figuresCollection);


    @Override
    public void execute(CommandParameter parameter) {
        super.execute(parameter);

        figuresCollection.removeFigureNumber(sm.chooseFigure());
    }
}
