package time;

import java.time.LocalTime;

public class LocalTimeMain {
    public static void main(String[] args) {
        LocalTime nowTime = LocalTime.now();
        LocalTime ofTime = LocalTime.of(7,8,30);

        System.out.println(nowTime);
        System.out.println(ofTime);

        // 계산(불변)
        LocalTime ofTimePlus = ofTime.plusSeconds(30);
        System.out.println(ofTimePlus);
    }
}
