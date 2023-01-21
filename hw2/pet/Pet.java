package pet;

import animal.Animal;

import java.util.ArrayList;

public abstract class Pet extends Animal implements Affectionate {

    private String name;
    private String breed;
    private String color;
    private int birthYear;
    private ArrayList<String> vaccinations;

    public abstract void affect();

    protected Pet(int height, float weight, String eyeColor, String name, String breed, String color, int birthYear) {
        super(height, weight, eyeColor);
        this.name = name;
        this.breed = breed;
        this.color = color;
        this.birthYear = birthYear;
        this.vaccinations = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    public String getColor() {
        return color;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public ArrayList<String> getVaccinations() {
        return vaccinations;
    }

    public void addVaccination(String vaccine){
        vaccinations.add(vaccine);
    }

    @Override
    public String toString() {
        return
                "name='" + this.getName() + '\'' +
                ", breed='" + this.getBreed() + '\'' +
                ", color='" + this.getColor() + '\'' +
                ", birth=" + this.getBirthYear() + ", " +
                 super.toString() +
                ", vaccinations=" + this.getVaccinations();
    }
}
