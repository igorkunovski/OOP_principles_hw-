package bird;

public class Stork extends Bird{

    public Stork(int height, float weight, String eyeColor, int flyHeight) {
        super(height, weight, eyeColor, flyHeight);
    }

    public Stork(int flyHeight) {
        super(flyHeight);
    }

    @Override
    public void makeSound() {
        System.out.println("Tr-tr-tr - stork sound");
    }

    @Override
    public String toString() {
        return "Stork " + super.toString();
    }
}
