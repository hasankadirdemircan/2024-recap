package recap.java8.predicate;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Predicate02 {

    public static void main(String[] args) {
        //Java9
        List<String> myList = List.of("java8", "hasan", "kadir", "demircan", "hello", "hhhh");
        Stream<String> myStream = myList.stream();

        Predicate<String> predicate1 = element -> element.length() == 4;
        myStream.filter(predicate1).forEach(System.out::println);

        Stream<String> myStream2 = myList.stream();
        List<String> filteredList = myStream2.filter(predicate1).collect(Collectors.toList());
        //stream' i list'e donusturdum.

        System.out.println(myList);
        System.out.println(filteredList);


        List<String> myList2 = List.of("java8", "hasan", "kadir", "demircan", "hello", "hhhh");
        myList2.stream().filter(s -> s.length() == 4).forEach(System.out::println);
        List<String> filteredList2 = myList2.stream().filter(s -> s.length() == 4).toList();
    }
}
