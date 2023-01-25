import collection.FiguresCollection;
import figure.*;
import user.UserInterface;

public class Main_hw3 {

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

        UserInterface ui = new UserInterface();
        ui.chooseCollection(fc);
        ui.userInterface();
    }
}
