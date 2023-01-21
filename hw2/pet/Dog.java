package pet;

public class Dog extends Pet implements Trainable{

    private boolean trained;

    public Dog(int height, float weight, String eyeColor, String name, String breed, String color, int birthYear, boolean trained) {
        super(height, weight, eyeColor, name, breed, color, birthYear);
        this.trained = trained;
    }

    public void setTrained() {
        this.trained = true;
    }

    public boolean isTrained() {
        return trained;
    }

    public void train(){
        if (!this.isTrained()){
            this.setTrained();
        }
    }

    @Override
    public void makeSound() {
        System.out.println("Wofff!");

    }

    @Override
    public void affect() {
        System.out.println("Dog is happy and wagging the tail");
    }

    @Override
    public String toString() {
        return "Dog: " + super.toString() +
                ", trained=" + trained;
    }
}
