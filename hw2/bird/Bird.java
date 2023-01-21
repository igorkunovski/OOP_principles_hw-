package bird;

import animal.Animal;

public abstract class Bird extends Animal implements Flyable {

    private int flyHeight;
    private boolean flag;


    protected Bird(int height, float weight, String eyeColor, int flyHeight) {
        super(height, weight, eyeColor);
        this.flyHeight = flyHeight;
        this.flag = true;
    }

    public Bird(int flyHeight){
        super(0, 0, "none");
        this.flyHeight = flyHeight;
        this.flag = false;
    }

    public int getFlyHeight() {
        return flyHeight;
    }

    public boolean isFlag() {
        return flag;
    }

    public void fly(){
        System.out.printf("I'm flying at %s meters%n", this.getFlyHeight());
    }

    @Override
    public String toString() {
        return isFlag() ?  super.toString() + ", flyHeight = " + this.getFlyHeight() + "m" :
         "flyHeight = " + this.getFlyHeight() + "m";
    }
}
