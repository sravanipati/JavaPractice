

import java.util.stream.Stream;

public class BuilderExtras {
    public static void main(String[] args) {

        Stream.Builder<String> builder = Stream.builder();
        builder = builder.add("a");  // ok but not necessary
        builder.add("b");  // this works
        builder.add("c");

        Stream<String> stream = builder.build();
        stream.forEach(System.out::println);

        Stream.builder().add("a").add(10).build().forEach(
                System.out::println);

       
        Stream.<String>builder().add("a").add("b").build().forEach(
                System.out::println);

//        Stream.Builder builder3 = Stream.<String>builder();
//        builder3.add("a");
//        builder3.add(new Object());
//        Stream<String> s3 = builder3.build();
//        s3.forEach(System.out::println);
    }
}