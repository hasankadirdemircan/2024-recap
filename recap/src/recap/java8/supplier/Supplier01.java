package recap.java8.supplier;

import java.util.Random;
import java.util.function.Supplier;

public class Supplier01 {
    public static void main(String[] args) {
        Supplier<String> supplier01 = () -> "Supplier Example";
        System.out.println(supplier01.get());
        Random random = new Random();

        Supplier<Integer> supplier02 = () -> random.nextInt();

        System.out.println(supplier02.get());
    }
}
