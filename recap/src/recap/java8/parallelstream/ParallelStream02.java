package recap.java8.parallelstream;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class ParallelStream02 {

    public static void main(String[] args) {

        // 100,000 adet Integer değeri içeren bir liste oluşturun
        List<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= 10000000; i++) {
            numbers.add(i);
        }
        System.out.println("start : "+ LocalDateTime.now());
        // Normal stream kullanarak sayıların toplamını hesaplayın
        int sum = numbers.stream()
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println("end : "+ LocalDateTime.now());

        // Sonucu ekrana yazdırın
        System.out.println("Toplam: " + sum);
    }

}
/*
start : 2024-08-18T13:50:47.420135
end : 2024-08-18T13:50:47.435768
Toplam: 705082704
 */