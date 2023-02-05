package collection;

import comparator.*;
import figure.*;
import static config.Calculation.*;
import java.util.ArrayList;
import java.util.List;

public class FiguresCollection {

    private final List<Figure> figures;
    int index;

    public FiguresCollection() {
        figures = new ArrayList<>();
        index = 0;
    }

    public List<Figure> getFigures() {
        return figures;
    }

    public void addFigure(Figure figure) {
        if (!figures.contains(figure) && figure != null) {
            figures.add(figure);
        }
    }

    public void getAllSquares(){
        if (figures.size()> 0){
            for (Figure figure: figures) {
                getSquare(figure);
            }
        }else {
            System.out.println("List is empty.");
        }
    }

    public void getAllPerimeters(){
        if (figures.size()> 0){
            for (Figure figure: figures) {
                getPerimeter(figure);
            }
        }else {
            System.out.println("List is empty.");
        }
    }

    public void getAllCircleLengths(){
        if (figures.size()> 0){
            for (Figure figure: figures) {
                getCircleLength(figure);
            }
        }else {
            System.out.println("List is empty.");
        }
    }

    public void getFigureData(int num){

        if (figures.size() >= num && num > 0){
            System.out.printf("\nFigure Nr. %d: %s\n", num, figures.get(num -1));
            System.out.printf("Square: %.2f\n", figures.get(num -1).getSquare());

            if (figures.get(num -1) instanceof Perimeterable){
                System.out.printf("Perimeter: %.2f\n", ((Perimeterable) figures.get(num-1)).getPerimeter());
            }
            if (figures.get(num -1) instanceof CircleLength){
                System.out.printf("Circle length: %.2f\n", ((CircleLength) figures.get(num-1)).getCircleLength());
            }
        } else{
            System.out.println();
            System.out.println("Invalid index");
        }
    }

    public void showList(){
        if (figures.size() > 0){
            System.out.println("We have in List at the moment: ");
            for (int i = 0; i < figures.size(); i++) {
                System.out.printf("Figure Nr. %d - (%s)\n", i + 1, figures.get(i));
            }
        }else{
            System.out.println();
            System.out.println("The List iz empty");
        }
    }

    public void showAllPossibleFiguresData(){
        System.out.println("** Squares **");
        getAllSquares();
        System.out.println("** Perimeters **");
        getAllPerimeters();
        System.out.println("** Lengths **");
        getAllCircleLengths();
    }

    public void removeFigureNumber(int num){
        if (figures.size() >= num && num > 0){
            System.out.printf("%s <--- removed form List\n", figures.get(num-1));
            figures.remove(num - 1);
        } else{
            System.out.println("Invalid index");
        }
    }

    public void replaceFigure(int num, Figure figure){

        if (num < 1 || num> figures.size()){
            System.out.println("Invalid index");
        }
        if (figures.size() >= num && num > 0 && figure!=null) {
            if (figures.contains(figure)) {
                System.out.println("This figure is already in The list");
            } else {
                System.out.printf("%s <--- replaced by %s\n", figures.get(num - 1), figure);
                figures.set((num - 1), figure);
            }
        } else{
            System.out.println("The Figure was not created!");
        }
    }

    public void sortBySquare(){
        SquareComparator sc = new SquareComparator();
        getFigures().sort(sc);
    }

    public void sortByPerimeter(){
        PerimeterComparator pc = new PerimeterComparator();
        getFigures().sort(pc);
    }

    public void sortByCircleLength() {
        CircleLengthComparator clc = new CircleLengthComparator();
        getFigures().sort(clc);
    }
}
