

import java.util.stream.Stream;

public class StreamExtras {
    public static void main(String[] args) {

        Stream<Integer> stream = Stream.of(10, 20, 30);
//        stream.limit(20);
        stream = stream.limit(3);
        stream.forEach(System.out::println);
    }
}