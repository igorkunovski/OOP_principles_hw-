public class Main_hw4 {
    public static void main(String[] args) {

        ArrayBuilder<String> str = new ArrayBuilder<>(new String[]{"aa", "bb", "cc", "cc","cc", "ac"});
        ArrayBuilder<Integer> integers = new ArrayBuilder<>(new Integer[]{1, 10, 8});

        str.add("Added");
        str.printArray();
        integers.printArray();

        System.out.println(integers.findElement(10));
        System.out.println(str.findElement("cc"));
        System.out.println(str.ifElementInList("cc"));

        str.replace(0, "zzz");
        integers.replace(0, 999);
        str.printArray();
        integers.printArray();

        ArrayBuilder<Person> persons = new ArrayBuilder<>();
        persons.add(new Person("AA", 1, true));

        System.out.println(persons.getSize());
        System.out.println(persons.getLength());
        persons.add(new Person("BB", 2, false));
        persons.add(new Person("CC", 3, true));
        persons.add(new Person("CC", 3, true));

        persons.printArray();

        persons.removeByIndex(0);
        persons.removeByData(new Person("CC", 3, true));
        str.removeByIndex(0);
        str.removeByData("cc");
        persons.printArray();
        str.printArray();
    }
}
