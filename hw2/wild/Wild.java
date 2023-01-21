package wild;

import animal.Animal;

public abstract class Wild extends Animal {

    private String place;
    private int foundYear;

    public Wild(int height, float weight, String eyeColor, String place, int foundYear) {
        super(height, weight, eyeColor);
        this.place = place;
        this.foundYear = foundYear;
    }

    public String getPlace() {
        return place;
    }

    public int getFoundYear() {
        return foundYear;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", place= " + this.getPlace()  +
                ", foundYear=" + this.getFoundYear();
    }
}
