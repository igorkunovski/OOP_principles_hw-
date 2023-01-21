package wild;

public class Wolf extends Wild{

    private boolean leader;

    public Wolf(int height, float weight, String eyeColor, String place, int foundYear, boolean leader) {
        super(height, weight, eyeColor, place, foundYear);
        this.leader = leader;
    }

    public boolean isLeader() {
        return leader;
    }

    @Override
    public void makeSound() {
        System.out.println("Wolf is howling...");
    }

    @Override
    public String toString() {
        return "Wolf: " + super.toString() +
                ", leader=" + this.isLeader();
    }
}
