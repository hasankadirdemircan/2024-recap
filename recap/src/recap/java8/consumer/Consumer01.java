package recap.java8.consumer;

import java.util.function.Consumer;

public class Consumer01 {

    public static void main(String[] args) {
        String name = "hasan";
        String a = name.toUpperCase();

        // we can say consumer.
        // java.util.Function paketinde yer alir.
        // void accept(T t);

        // package java.util.stream;
        // void forEach(Consumer<? super T> action);

        Consumer<String> printUpperCase = str -> System.out.println(str.toUpperCase());
        printUpperCase.accept("java");
    }
}
