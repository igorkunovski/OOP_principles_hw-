package user;

import collection.FiguresCollection;
import exception.FigureCreationException;
import figure.*;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UserInterface {
    private int userChoice;
    FiguresCollection collection;

    public void chooseCollection(FiguresCollection collection) {
        this.collection = collection;
    }

    public void userInterface() {

        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.println("----MENU----");
        System.out.println(" Please choose number of command and press Enter");
        System.out.println(" 1. Add new figure to Collection");
        System.out.println(" 2. Remove figure from Collection by number");
        System.out.println(" 3. Show all figures with possible data");
        System.out.println(" 4. Replace figure by index");
        System.out.println(" 5. Sort figures in Collection by Square");
        System.out.println(" 6. Sort figures in Collection by Perimeter where possible");
        System.out.println(" 7. Sort figures in Collection by Circle Length where possible");
        System.out.println(" 8. Show figure possible data");
        System.out.println(" 9. Quit program");

        try {
            this.userChoice = sc.nextInt();
        }catch (InputMismatchException e){
            System.out.println("Incorrect data inserted");
            userInterface();
        }
        process(userChoice);
    }

    private void process(int userChoice) {
        switch (userChoice) {
            case 1:
                Figure newFigure = figureCreation();

                if (newFigure != null) {
                    collection.addFigure(newFigure);
                    System.out.println("New Figure was created and added to List");
                    collection.showList();
                }
                userInterface();
                break;
            case 2:
                collection.removeFigureNumber(chooseFigure());
                userInterface();
                break;
            case 3:
                collection.showList();
                collection.showAllPossibleFiguresData();
                userInterface();
                break;
            case 4:
                collection.replaceFigure(chooseFigure(), figureCreation());
                userInterface();
                break;
            case 5:
                collection.sortBySquare();
                collection.getAllSquares();
                userInterface();
                break;
            case 6:
                collection.sortByPerimeter();
                collection.getAllPerimeters();
                userInterface();
                break;
            case 7:
                collection.sortByCircleLength();
                collection.getAllCircleLengths();
                userInterface();
                break;
            case 8:
                collection.getFigureData(chooseFigure());
                userInterface();
                break;
            case 9: break;
            default:
                System.out.println("Incorrect number");
                userInterface();
                break;
        }
    }

    private Figure figureCreation() {

        double side1, side2, side3;

        Scanner sc = new Scanner(System.in);
        System.out.println(" Please choose number of Figure to create and press Enter");
        System.out.println(" 1. Triangle, 2. Square, 3. Rectangle, 4. Circle");

        try {

            this.userChoice = sc.nextInt();

            switch (userChoice) {
                case 1 -> {
                    System.out.println("Insert side1");
                    side1 = sc.nextDouble();
                    System.out.println("Insert side2");
                    side2 = sc.nextDouble();
                    System.out.println("Insert side3");
                    side3 = sc.nextDouble();
                    return new Triangle(side1, side2, side3);
                }
                case 2 -> {
                    System.out.println("Insert side");
                    side1 = sc.nextDouble();
                    return new Square(side1);
                }
                case 3 -> {
                    System.out.println("Insert width");
                    side1 = sc.nextDouble();
                    System.out.println("Insert height");
                    side2 = sc.nextDouble();
                    return new Rectangle(side1, side2);
                }
                case 4 -> {
                    System.out.println("Insert radius");
                    side1 = sc.nextDouble();
                    return new Circle(side1);
                }
                default -> {
                    System.out.println("Incorrect number");
                    userInterface();
                }
            }

        }catch (FigureCreationException e){
            System.err.println(e.getMessage());
        }
        return null;
    }

    private int chooseFigure() {

        Scanner sc = new Scanner(System.in);
        collection.showList();
        System.out.println(" Please choose number of Figure and press Enter");
        userChoice = sc.nextInt();
        return userChoice;
    }
}
