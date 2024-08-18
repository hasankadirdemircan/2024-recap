package recap.java8.function;

import java.util.function.Function;

public class Function02 {
    public static void main(String[] args) {
        Function<String, Integer> f1 = str -> Integer.parseInt(str);
        //
        Function<String, Integer> f2 = Integer::parseInt;
        // public static int parseInt(String s)
        // public interface Function<T, R>

        System.out.println(f1.apply("798"));
        System.out.println(f2.apply("5000"));
        // public static int abs(int a);

        Function<Integer, Integer> f3 = Math::abs;
        // public static int abs(int a)
        // open case
        Function<Integer, Integer> f4 = str -> Math.abs(str);

        System.out.println(f3.apply(-600));
        System.out.println(f4.apply(-700));
    }
}
