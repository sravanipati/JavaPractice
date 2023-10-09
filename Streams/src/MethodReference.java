

import java.util.Arrays;
import java.util.Random;
import java.util.stream.Stream;

class TestPerson {

    public static String[] namesArray = {"Allen", "Bob", "Caleb", "Don", "Fred",
            "Greg", "Howard", "Ira", "James", "Kevin"};
    private String name;

    {
        int i = new Random().nextInt(10);
        this.name = namesArray[i];
    }

    public String toString() {
        return this.name + " ";
    }

    public String getName() {
        return this.name;
    }

    public static void printStatic(String s) {
        System.out.print(s + " ");
    }

    public void printInstance(String s) {
        System.out.print(s + ", ");
    }
}

public class MethodReference {
    public static void main(String[] args) {

        Arrays.stream(TestPerson.namesArray)
                .forEach(System.out::println);

        System.out.println("------ Four types of Method References ------");
        System.out.println("Static Method on a class: ");
        Arrays.stream(TestPerson.namesArray)
                .forEach(TestPerson::printStatic);

        System.out.println("\nInstance Method on an object: ");
        Arrays.stream(TestPerson.namesArray)
                .forEach(new TestPerson()::printInstance);

        System.out.println("\nInstance Method on an arbitrary object: ");
        Arrays.sort(TestPerson.namesArray, String::compareToIgnoreCase);

        System.out.println("\nReference to Constructor: ");
        Stream.generate(TestPerson::new)  
                .limit(15)                
                .sorted((s, t) -> s.getName().compareToIgnoreCase(t.getName()))
                .forEach(System.out::print);

    }
}