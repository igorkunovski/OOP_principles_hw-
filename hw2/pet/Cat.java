package pet;

public class Cat extends Pet {

    private boolean hasWool;

    public boolean isHasWool() {
        return hasWool;
    }

    public Cat(int height, float weight, String eyeColor, String name, String breed, String color, int birthYear,
               boolean hasWool) {
        super(height, weight, eyeColor, name, breed, color, birthYear);
        this.hasWool = hasWool;
    }

    @Override
    public void makeSound() {
        System.out.println("Meow");
    }

    @Override
    public void affect() {
        System.out.println("Murmur");
    }

    @Override
    public String toString() {
        return "Cat: " + super.toString() +
                ", hasWool=" + this.isHasWool();
    }
}
