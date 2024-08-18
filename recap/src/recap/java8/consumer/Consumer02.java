package recap.java8.consumer;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Consumer02 {
    public static void main(String[] args) {
        // the forEach method gets the consumer.
        // package java.util.stream; -> void forEach(Consumer<? super T> action);

        // 1. use-case
        Consumer<Integer> c1 = x -> System.out.println(x * 2);
        Stream.of(1,2).forEach(c1);

        // 2. use-case
        Consumer<Integer> c2 = (Integer x) -> System.out.println(x);
        Stream.of(1,2).forEach(c2);

        // 3. use-case
        Stream.of(1,2).forEach(x -> System.out.println(x+2));

        // 4. use-case
        Stream.of(1,2).forEach(System.out::println);

        List.of("hasan", "mehmet").stream().forEach(System.out::println);
        Predicate<String> predicate1 = x -> x.length() > 3;
        List.of("hasan", "mehmet").stream().filter(predicate1).forEach(System.out::println);
    }
}
