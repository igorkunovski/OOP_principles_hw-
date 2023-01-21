package bird;

public class Chicken extends Bird{

    public Chicken(int height, float weight, String eyeColor, int flyHeight) {
        super(height, weight, eyeColor, flyHeight);
    }

    public Chicken(int flyHeight) {
        super(flyHeight);
    }

    @Override
    public void makeSound() {
        System.out.println("ku-ka-re-ku");
    }

    @Override
    public String toString() {
        return "Chicken " + super.toString();
    }
}
