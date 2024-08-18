package recap.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {
     /*   List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        int sum = numbers.stream()
                .filter(n -> n % 2 == 0)
                .map(n -> n * n)
                .filter(n -> n > 50)
                .reduce(0, Integer::sum);
        System.out.println(sum);
*/
/*
        List<String> words = Arrays.asList("cat", "elephant", "tiger", "lion", "dog");
        List<String> result = words.stream()
                .filter(word -> word.length() > 3)
                .sorted()
                .collect(Collectors.toList());
        System.out.println(result);
*/
      /*  List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        String result = numbers.stream()
                .map(n -> n * n)
                .filter(n -> n % 2 != 0)
                .map(String::valueOf)
                .collect(Collectors.joining(", "));
        System.out.println(result); */

        System.out.println(new StringBuilder("banana").reverse().toString());
        List<String> words = Arrays.asList("apple", "banana", "cherry", "date", "fig");
        List<String> result = words.stream()
                .map(word -> new StringBuilder(word).reverse().toString())
                .filter(word -> word.length() > 4)
                .sorted(Comparator.comparingInt(String::length))
                .collect(Collectors.toList());
        System.out.println(result);


    }
}
