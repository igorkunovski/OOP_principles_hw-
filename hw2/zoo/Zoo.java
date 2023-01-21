package zoo;

import animal.Animal;

import java.util.ArrayList;

public class Zoo {

    private ArrayList<Animal> animals = new ArrayList<>();

    public void showAnimals() {
        if (animals.size() > 0){
            System.out.println("We have in Zoo at the moment: ");
            for (int i = 0; i < animals.size(); i++){
                System.out.printf("Animal Nr. %d - (%s)\n", i+1, animals.get(i).getClass().getSimpleName());
            }
        }else{
            System.out.println();
            System.out.println("The Zoo iz empty");
        }
    }

    public void putIntoZoo(Animal animal){
        if (!animals.contains(animal)) {
            this.animals.add(animal);
            System.out.printf("%s <--- added to zoo\n", animal.toString());
        }else{
            System.out.println("This animal is already in Zoo");
        }
    }


    public void removeFromZooByNumber(int num){
        if (animals.size() >= num && num > 0){
            System.out.printf("%s <--- removed form Zoo\n", animals.get(num-1));
            animals.remove(num - 1);
        } else{
            System.out.println("The number is bigger than animals in Zoo");
        }
    }

    public void makeSoundByNumber(int num){
        if (animals.size() >= num && num > 0){
            animals.get(num-1).makeSound();
        } else{
            System.out.println("The number is bigger than animals in Zoo");
        }
    }

    public void makeAllAnimalsSound(){
        if (animals.size() > 0){
            for (Animal animal: animals) {
                animal.makeSound();
            }
        } else{
            System.out.println("The Zoo is empty");
        }
    }


    public void showAnimalByNumber(int num) {
        if (animals.size() >= num && num > 0){
            System.out.printf("Animal Nr. %d: %s\n", num, animals.get(num -1));
        } else{
            System.out.println();
            System.out.println("We have less animals than this number in the Zoo");
        }
    }
}
