package recap.java8.predicate;

import java.util.function.Predicate;
import java.util.stream.Stream;

public class Predicate01 {

    public static void main(String[] args) {
        Predicate<String> predicate1 = element -> element.startsWith("h");
        // 1 tane parametre alıyorsa ve tipini belirtmediysek paranteze gerek yoktur.

        Predicate<String> predicate2 = (String element) -> element.startsWith("h");
        // parametre tipini belirtirsek kullanım şekli.

        Predicate<String> predicate3 = (String element) -> {
            return element.startsWith("h");
        };
        // açık şekilde return etmek istersek,
        // süslü parantez kullanmamız gerekir.

        // Yukarıdaki 3 predicate kullanımıda aynı anlama gelmektedir.

        Stream.of("java8", "hasan", "kadir", "demircan", "hello").filter(predicate1).forEach(System.out::println);

    }
}

