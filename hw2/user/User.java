package user;

import java.util.InputMismatchException;
import java.util.Scanner;

import animal.Animal;
import bird.*;
import pet.*;
import wild.*;
import zoo.Zoo;

public class User {
    private int userChoice;
    Zoo zoo;

    public void chooseZoo(Zoo zoo) {
        this.zoo = zoo;
    }

    public void userInterface() {

        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.println(" Please choose number of command and press Enter");
        System.out.println(" 1. Add new animal to Zoo");
        System.out.println(" 2. Remove animal from zoo by number");
        System.out.println(" 3. Show Animal by number");
        System.out.println(" 4. Show all Animals at Zoo");
        System.out.println(" 5. Make sound of Animal by number");
        System.out.println(" 6. Make sound of all Animals in Zoo");
        System.out.println(" 7. Quit program");

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
                Animal newAnimal = animalCreation();

                if (newAnimal != null) {
                    zoo.putIntoZoo(newAnimal);
                    zoo.showAnimals();
                }
                userInterface();
                break;
            case 2:
                zoo.removeFromZooByNumber(chooseAnimal());
                userInterface();
                break;
            case 3:
                zoo.showAnimalByNumber(chooseAnimal());
                userInterface();
                break;
            case 4:
                zoo.showAnimals();
                userInterface();
                break;
            case 5:
                zoo.makeSoundByNumber(chooseAnimal());
                userInterface();
                break;
            case 6:
                zoo.makeAllAnimalsSound();
                userInterface();
                break;
            case 7:
                break;
            default:
                System.out.println("Incorrect number");
                userInterface();
                break;
        }
    }

    private int chooseAnimal() {
        Scanner sc = new Scanner(System.in);
        zoo.showAnimals();
        System.out.println(" Please choose number of Animal and press Enter");
        this.userChoice = sc.nextInt();
        return userChoice;
    }

    private Animal animalCreation() {

        int height, flyHeight, birthYear, foundYear;
        float weight;
        String eyeColor, name, breed, color, place;
        boolean hasWool, trained, leader;

        Scanner sc = new Scanner(System.in);
        System.out.println(" Please choose number of Animal to insert and press Enter");
        System.out.println(" 1. Chicken, 2. Stork, 3. Cat, 4. Dog, 5. Tiger, 6. Wolf");

        try {

            this.userChoice = sc.nextInt();

            switch (userChoice) {
                case 1 -> {
                    System.out.println("Insert height");
                    height = sc.nextInt();
                    System.out.println("Insert weight");
                    weight = sc.nextFloat();
                    System.out.println("Insert eye color");
                    eyeColor = sc.next();
                    System.out.println("Insert fly Height");
                    flyHeight = sc.nextInt();
                    return new Chicken(height, weight, eyeColor, flyHeight);
                }
                case 2 -> {
                    System.out.println("Insert height");
                    height = sc.nextInt();
                    System.out.println("Insert weight");
                    weight = sc.nextFloat();
                    System.out.println("Insert eye color");
                    eyeColor = sc.next();
                    System.out.println("Insert fly Height");
                    flyHeight = sc.nextInt();
                    return new Stork(height, weight, eyeColor, flyHeight);
                }
                case 3 -> {
                    System.out.println("Insert height");
                    height = sc.nextInt();
                    System.out.println("Insert weight");
                    weight = sc.nextFloat();
                    System.out.println("Insert eye color");
                    eyeColor = sc.next();
                    System.out.println("Insert name");
                    name = sc.next();
                    System.out.println("Insert breed");
                    breed = sc.next();
                    System.out.println("Insert color");
                    color = sc.next();
                    System.out.println("Insert birth year");
                    birthYear = sc.nextInt();
                    System.out.println("Has wool? True or False");
                    hasWool = sc.hasNext();
                    return new Cat(height, weight, eyeColor, name, breed, color, birthYear, hasWool);
                }
                case 4 -> {
                    System.out.println("Insert height");
                    height = sc.nextInt();
                    System.out.println("Insert weight");
                    weight = sc.nextFloat();
                    System.out.println("Insert eye color");
                    eyeColor = sc.next();
                    System.out.println("Insert name");
                    name = sc.next();
                    System.out.println("Insert breed");
                    breed = sc.next();
                    System.out.println("Insert color");
                    color = sc.next();
                    System.out.println("Insert birth year");
                    birthYear = sc.nextInt();
                    System.out.println("Has wool? True or False");
                    trained = sc.hasNext();
                    return new Dog(height, weight, eyeColor, name, breed, color, birthYear, trained);
                }
                case 5 -> {
                    System.out.println("Insert height");
                    height = sc.nextInt();
                    System.out.println("Insert weight");
                    weight = sc.nextFloat();
                    System.out.println("Insert eye color");
                    eyeColor = sc.next();
                    System.out.println("Insert place");
                    place = sc.next();
                    System.out.println("Insert found year");
                    foundYear = sc.nextInt();
                    return new Tiger(height, weight, eyeColor, place, foundYear);
                }
                case 6 -> {
                    System.out.println("Insert height");
                    height = sc.nextInt();
                    System.out.println("Insert weight");
                    weight = sc.nextFloat();
                    System.out.println("Insert eye color");
                    eyeColor = sc.next();
                    System.out.println("Insert place");
                    place = sc.next();
                    System.out.println("Insert found year");
                    foundYear = sc.nextInt();
                    System.out.println("Is it leader? True or False");
                    leader = sc.hasNext();
                    return new Wolf(height, weight, eyeColor, place, foundYear, leader);
                }
            }
        } catch (InputMismatchException e) {
            System.out.println("Incorrect data inserted");
        }
        return null;
    }
}
