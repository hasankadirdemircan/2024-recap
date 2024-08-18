package recap.java8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Stream02 {
    public static void main(String[] args) {
        List<String> numbers = Arrays.asList("1", "2", "3", "4", "5", "6");

        List<Integer> even = numbers.stream()
                .map(Integer::valueOf)
                .filter(number -> number % 2 == 0)
                .toList();

        System.out.println(even);
    }
}
