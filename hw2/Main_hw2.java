import animal.Animal;
import bird.*;
import pet.Dog;
import user.User;
import wild.*;
import zoo.*;

public class Main_hw2 {
    public static void main(String[] args) {

        Animal wolf = new Wolf(50, 40, "grey", "Russia", 2015, true);
        Animal dog = new Dog(50, 40, "grey", "Jack", "beagle", "brown", 2018, false);
        Animal chicken = new Chicken(2);
        Animal stork = new Stork(100,5,"black",1000);

        ((Chicken)chicken).fly();
        ((Dog)dog).train();

        Zoo zoo = new Zoo();
        zoo.putIntoZoo(stork);
        zoo.putIntoZoo(chicken);
        zoo.putIntoZoo(wolf);
        zoo.putIntoZoo(dog);

        User user = new User();
        user.chooseZoo(zoo);
        user.userInterface();
    }
}
