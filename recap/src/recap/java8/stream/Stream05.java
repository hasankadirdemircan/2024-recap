package recap.java8.stream;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Stream05 {
    public static void main(String[] args) {
        List<List<Integer>> intsOfInts = Arrays.asList(Arrays.asList(1, 3, 5), Arrays.asList(2, 4));

        intsOfInts.stream()
                .flatMap(Collection::stream)
                .sorted()
                .map(i -> i * i)
                .forEach(System.out::println);
    }
}
