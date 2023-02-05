package commands.base;

import collection.FiguresCollection;
import commands.parameters.base.*;

public abstract class CommandBase implements Command{
    public FiguresCollection figuresCollection;

    public CommandBase(FiguresCollection figuresCollection) {

        this.figuresCollection = figuresCollection;
    }

    @Override
    public void execute(CommandParameter parameter) {
        if (!(parameter instanceof IndexParameter)){
            try {
                throw new IllegalArgumentException();
            }catch (IllegalArgumentException e){
                System.err.println("Must be index parameter");
            }
        }
    }
}
