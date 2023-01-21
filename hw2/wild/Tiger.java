package wild;

public class Tiger extends Wild{

    public Tiger(int height, float weight, String eyeColor, String place, int foundYear) {
        super(height, weight, eyeColor, place, foundYear);
    }

    @Override
    public void makeSound() {
        System.out.println("Tiger's  Rrr-rr!!");

    }

    @Override
    public String toString() {
        return "Tiger: " + super.toString();
    }
}
