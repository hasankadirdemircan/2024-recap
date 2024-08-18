package recap.java8.parallelstream;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class ParallelStream01 {
    public static void main(String[] args) {
        // 100,000 adet Integer değeri içeren bir liste oluşturun
        List<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= 10000000; i++) {
            numbers.add(i);
        }

        // Parallel stream kullanarak sayıların toplamını hesaplayın
        System.out.println("start : "+ LocalDateTime.now());
        int sum = numbers.parallelStream()
                .mapToInt(Integer::intValue)
                .sum();

        System.out.println("end : "+ LocalDateTime.now());

        // Sonucu ekrana yazdırın
        System.out.println("Toplam: " + sum);
    }
}
