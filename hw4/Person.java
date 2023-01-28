public class Person implements Comparable<Person> {
    private String name;
    private int id;
    private boolean isAdult;

    public Person(String name, int id, boolean isAdult) {
        this.name = name;
        this.id = id;
        this.isAdult = isAdult;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public boolean isAdult() {
        return isAdult;
    }

    public void setAdult(boolean adult) {
        isAdult = adult;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + getName() + '\'' +
                ", id=" + getId() +
                ", isAdult=" + isAdult() +
                '}';
    }

    @Override
    public boolean equals(Object p) {
        if (p instanceof Person) {
            return this.getName().equals(((Person) p).getName())
                    && this.getId() == ((Person) p).getId()
                    && this.isAdult() == ((Person) p).isAdult();
        }
        return false;
    }

    @Override
    public int compareTo(Person p) {
        return getId()-p.getId();
    }
}
