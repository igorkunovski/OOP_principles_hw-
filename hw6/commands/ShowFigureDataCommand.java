package commands;

import collection.FiguresCollection;
import commands.base.CommandBase;
import config.SupportMethods;
import commands.parameters.base.CommandParameter;

public class ShowFigureDataCommand extends CommandBase {
    public ShowFigureDataCommand(FiguresCollection figuresCollection) {
        super(figuresCollection);
    }
    SupportMethods sm = new SupportMethods(figuresCollection);

    @Override
    public void execute(CommandParameter parameter) {
        super.execute(parameter);
        figuresCollection.getFigureData(sm.chooseFigure());
    }
}
