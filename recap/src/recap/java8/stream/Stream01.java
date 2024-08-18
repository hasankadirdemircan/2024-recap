package recap.java8.stream;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Stream01 {
    public static void main(String[] args) {
        IntStream.rangeClosed(0,10)
                .filter(i -> (i % 2 == 0))
                .map(i -> i*3)
                .forEach(System.out::println);

        System.out.println("-----------");

        Stream.of("Hasan", "Kadir", "", "Java")
                .filter(name -> !name.isEmpty())
                .forEach(System.out::println);

        System.out.println("-----------");
        Stream.of("Java", "Java", "Java8", "JAva")
                .distinct()
                .forEach(System.out::println);
        System.out.println("-----------");

        Stream<Integer> s = Stream.iterate(10, n -> n + 2);
        s.skip(3).limit(2).forEach(System.out::println); //16, 18
    }
}
