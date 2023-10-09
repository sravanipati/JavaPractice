

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

class Person {
    private String name;

    Person(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public String toString() {
        return " [" + this.name + "]";
    }
}

public class StreamPipeline {

    private static Person getNewPerson() {
        String[] names = {"Mary", "Jim", "Joe", "Aaron"};
        int i = new Random().nextInt(4);
        return new Person(names[i]);
    }

    public static void main(String[] args) {

        System.out.println("---- Process pipeline for First, Second ----");
        Stream.of("First", "Second").forEach((s) -> System.out.println(s));

        System.out.println("---- Created a personStream variable ----");
        Stream<Person> personStream = Stream.generate(() -> getNewPerson());

        for (int i = 0; i < 3; i++) {
            System.out.println("\tJust looping for the heck of it");
        }
        System.out.println("------ Adding intermediate operation to pipeline -----");
        personStream = personStream.limit(4);

        for (int i = 0; i < 3; i++) {
            System.out.println("\tAgain looping for the heck of it");
        }
        System.out.println("---- Process pipeline for personStream ----");
        personStream.forEach((s) -> System.out.println(s));

        List<Person> personList = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            personList.add(getNewPerson());
        }

        long jimCount = personList.stream()
                .filter((s) -> s.getName().equals("Jim"))
                .count();
        System.out.println("Randomly generated number of Jim Persons: " +
                jimCount + "/20");

        Stream<Person> personsStream = personList.stream();
        personsStream = personsStream.filter(
                (s) -> s.getName().equals("Mary"));
        long maryCount = personsStream.count();
        System.out.print("Randomly generated number of Mary Persons: " +
                maryCount+ "/20");
//        personsStream.forEach((s)->System.out.println(s));

        System.out.println("\n---- Creating another personStream variable ----");
        Stream<Person> personStreamNext =
                Stream.generate(() -> getNewPerson());

        System.out.println("Matched on Aaron on an infinite Stream = "+
                personStreamNext.anyMatch(
                        (s)-> s.getName().equals("Aaron")));

    }

}