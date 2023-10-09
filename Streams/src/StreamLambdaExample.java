
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamLambdaExample {
    public static void main(String[] args) {

        String[] namesArray = {"Allen", "Bob", "Caleb", "Don", "Fred",
                "Greg", "Howard", "Ira", "James", "Kevin"};

        System.out.println("filter and count example: (length > 3 and" +
                " length < 6 : " +
                Arrays.stream(namesArray)
                        .filter((s) -> s.length() > 3)
                        .filter((s) -> s.length() < 6)
                        .count());

        System.out.println("dropWhile Example: Drop names until Howard: " +
                Arrays.stream(namesArray)
                        .dropWhile(s -> !s.equals("Howard"))
                        .collect(Collectors.toList()));

        System.out.println("takeWhile Example: Add names until Howard: " +
                Arrays.stream(namesArray)
                        .takeWhile(s -> !s.equals("Howard"))
                        .collect(Collectors.toList()));

        System.out.println("skip Example: skip first two names: " +
                Arrays.stream(namesArray)
                        .skip(2)
                        .collect(Collectors.toList()));

        System.out.println("reduce example: Sum of the numbers = " +
                Stream.iterate(5, (t) -> t <= 100, (t) -> t + 5)
                        .reduce(Integer::sum).get());

    }

    private static int sum(int a, Integer b) {
        return a + b;
    }
}