package time;

import java.time.LocalDate;

public class LocalDateMain {
    public static void main(String[] args) {
        LocalDate nowDate = LocalDate.now();
        LocalDate ofDate = LocalDate.of(2024,9,30);
        System.out.println(nowDate);
        System.out.println(ofDate);

        // 계산
        ofDate = ofDate.plusDays(10);
        System.out.println(ofDate);
    }
}
