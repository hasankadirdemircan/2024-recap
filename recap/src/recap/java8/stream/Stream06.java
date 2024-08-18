package recap.java8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Stream06 {
    public static void main(String[] args) {
        Stream<String> s1 = Stream.of("k1", "k2", "k3");
        long countElement = s1.count();
        System.out.println(countElement);

        List<String> l1 = Arrays.asList("k1", "k2", "k3");
        System.out.println(l1.stream().count());

    }
}
