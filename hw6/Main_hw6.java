import collection.FiguresCollection;
import commands.*;
import commands.base.Command;
import figure.*;
import user.UserInterface;

import java.util.HashMap;

public class Main_hw6 {

    public static void main(String[] args) {

        Figure rect1 = new Rectangle(2, 3);
        Figure sq1 = new Square(5);
        Figure triangle1 = new Triangle(3, 4, 5);
        Figure circle1 = new Circle(4);
        Figure circle2 = new Circle(1);

        FiguresCollection fc = new FiguresCollection();
        fc.addFigure(triangle1);
        fc.addFigure(sq1);
        fc.addFigure(rect1);
        fc.addFigure(circle1);
        fc.addFigure(circle2);


        HashMap<Integer, Command> commandMap = new HashMap<>();
        commandMap.put(1, new AddNewFigureCommand(fc));
        commandMap.put(2, new RemoveByIndexCommand(fc));
        commandMap.put(3, new ShowAllFiguresCommand(fc));
        commandMap.put(4, new ReplaceFigureByIndex(fc));
        commandMap.put(5, new SortBySquaresCommand(fc));
        commandMap.put(6, new SortByPerimetersCommand(fc));
        commandMap.put(7, new SortByCircleCommand(fc));
        commandMap.put(8, new ShowFigureDataCommand(fc));
        commandMap.put(9, new ExitCommand(fc));

        UserInterface ui = new UserInterface(commandMap);
        ui.run();
    }
}
