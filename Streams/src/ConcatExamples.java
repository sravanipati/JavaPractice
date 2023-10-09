

import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Stream;

public class ConcatExamples {
    public static void main(String[] args) {

        // Set up some test data
        Set tree1 = new TreeSet(List.of("Ralph", "Larry", "Carol", "Mark"));
        Set tree2 = new TreeSet(List.of("Mark", "Mary", "Maggie"));

        // Print each set's elements
        System.out.println("TreeSet orders naturally, " +
                "print using Set.forEach --");
        System.out.println("---First---");
        tree1.forEach(System.out::println);
        System.out.println("---Second---");
        tree2.forEach(System.out::println);

        System.out.println("TreeSet orders naturally, " +
                "print using stream().forEach() --");

        // Create streams for each Set, print each stream's elements
//        Stream<String> stream1 = tree1.stream();
//        stream1 = stream1.sorted(Comparator.reverseOrder());

//        System.out.println("---First---");
//        stream1.forEach(System.out::println);

//        Stream<String> stream2 = tree2.stream();
//        stream2 = stream2.filter(s-> s.charAt(s.length()-1) != 'y');

        Stream<String> stream1 = tree1.stream();
        stream1 = stream1.peek(s -> System.out.print("-- 1 -- "));

        Stream<String> stream2 = tree2.stream();
        stream2 = stream2.peek(s -> System.out.print("-- 2 -- "));

//        System.out.println("---Second---");
//        stream2.forEach(System.out::println);

        System.out.println("---Merged---");
        Stream<String> merged = Stream.concat(stream1, stream2);
//        merged.forEach(System.out::println);

//        merged.distinct().forEach(System.out::println);
//
//        Stream<String> newMerge = Stream.concat(stream1, Stream.of("Zoe","Pete"));

        merged = merged.distinct();

//        Stream<String> newMerge = Stream.concat(stream1, Stream.of("Zoe", "Pete"));

//        stream1 = stream1.sorted(Comparator.reverseOrder());

        tree1.add("Zoe");

        merged.forEach(System.out::println);
    }
}