package animal;

public abstract class Animal {
    private int height;
    private float weight;
    private String eyeColor;

    public abstract void makeSound();

    protected Animal(int height, float weight, String eyeColor){
        this.height = height;
        this.weight = weight;
        this.eyeColor = eyeColor;
    }

    public float getHeight() {
        return height;
    }

    public float getWeight() {
        return weight;
    }

    public String getEyeColor() {
        return eyeColor;
    }

    @Override
    public String toString() {
        return "height=" + this.getHeight() + " sm" +
                ", weight=" + this.getWeight() + " kg" +
                ", eyeColor=" + this.getEyeColor();
    }
}
