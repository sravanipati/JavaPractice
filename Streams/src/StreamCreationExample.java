
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamCreationExample {
    public static void main(String[] args) {

        Stream<String> argsStream = Stream.empty();

        Stream<String> stringStream = Stream.of("First", "Second", "Third");

        String argumentString =
                (args != null && args.length > 0) ? args[0] : null;
        Stream<String> argStream = Stream.ofNullable(argumentString);

        System.out.println("\n----Infinite Stream created by " +
                "Supplier limited to 10 ");

        Stream<Double> infinitelyRandom = Stream.generate(Math::random);
        infinitelyRandom.limit(10).forEach((t) ->
                System.out.print(String.format("%.4f  ", t)));

        System.out.println("\n----Streams can be created from " +
                "Collection implementing types ");
        List<String> l = new ArrayList<>(List.of("First", "Second", "Third"));
        Stream<String> listStream = l.stream();
        listStream.forEach(System.out::println);

        Stream<Integer> infiniteStream = Stream.iterate(5,(t) -> t + 5);

        System.out.println("\n----Infinite Stream created by " +
                "UnaryOperator limited to 10 ");
        infiniteStream.limit(10).forEach((t) -> System.out.print(t + " "));

        System.out.println("\n---- Finite Stream created by " +
                "UnaryOperator limited to <= 100  ");
        Stream<Integer> finiteStream = Stream.iterate(5, (t) -> t <= 100,
                (t) -> t + 5);

        finiteStream.forEach((t) -> System.out.print(t + " "));

        for (String arg : args) {

            Stream<String> inputStream = Stream.of(arg.split("\\s"));


            argsStream = Stream.concat(argsStream, inputStream);
        }

        System.out.println("\n---- Stream of words from concatenated streams");
        argsStream.forEach(System.out::println);

        Stream.Builder<String> wordStreamBuilder = Stream.<String>builder();
        for (String arg : args) {
            for (String s : arg.split("\\s")) {
                wordStreamBuilder.accept(s);
            }
        }
        Stream<String> wordStream = wordStreamBuilder.build();
        System.out.println("\n---- Stream of words using Stream.Builder");
        wordStream.forEach(System.out::println);

    }
}