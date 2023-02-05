package commands;

import collection.FiguresCollection;
import commands.base.*;
import commands.parameters.base.CommandParameter;
import config.SupportMethods;
import figure.*;


public class AddNewFigureCommand extends CommandBase {

    public AddNewFigureCommand(FiguresCollection figuresCollection) {
        super(figuresCollection);
    }

    SupportMethods sm = new SupportMethods(figuresCollection);

    @Override
    public void execute(CommandParameter parameter) {
        super.execute(parameter);

        Figure newFigure = sm.figureCreation();

        if (newFigure != null) {
            figuresCollection.addFigure(newFigure);
            System.out.println("New Figure was created and added to List");
            figuresCollection.showList();
        }
    }
}
