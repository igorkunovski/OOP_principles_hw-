package config;

import collection.FiguresCollection;
import exception.FigureCreationException;
import figure.*;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SupportMethods {

    private FiguresCollection figuresCollection;

    public SupportMethods(){
    }

    public SupportMethods(FiguresCollection figuresCollection) {
        this();
        this.figuresCollection = figuresCollection;
    }


    public int chooseNumber() {
        Scanner sc = new Scanner(System.in);
        try {
            return sc.nextInt();
        }catch (InputMismatchException e){
            System.err.println("Incorrect input, try again");
        }
        return chooseNumber();
    }


    public int chooseFigure() {
        Scanner sc = new Scanner(System.in);
        figuresCollection.showList();
        System.out.println(" Please choose number of Figure and press Enter");
        try {
            return sc.nextInt();
        }catch (InputMismatchException e){
            System.err.println("Incorrect input, try again");
        }
        return chooseFigure();
    }


    public Figure figureCreation() {

        double side1, side2, side3;

        Scanner sc = new Scanner(System.in);
        System.out.println(" Please choose number of Figure to create and press Enter");
        System.out.println(" 1. Triangle, 2. Square, 3. Rectangle, 4. Circle");

        try {

            int userChoice = sc.nextInt();

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
                default ->
                    System.err.println("Incorrect number, try again");
            }

        }catch (FigureCreationException e){
            System.err.println(e.getMessage());
        }
        return null;
    }
}
