package lang.system;

import java.util.Arrays;

public class SystemMain {
    public static void main(String[] args) {
        //현재 시간(밀리초)를 가져온다.
        long currentTimeMills = System.currentTimeMillis();
        System.out.println(currentTimeMills);

        //현재 시간(나노초)를 가져온다.
        long currentNanoTime = System.nanoTime();
        System.out.println(currentNanoTime);

        // 환경 변수를 읽는다.
        System.out.println(System.getenv());

        // 시스템 속성을 읽는다.
        System.out.println(System.getProperties());
        System.out.println("java version = " + System.getProperty("java.version"));

        // 배열을 고속으로 복사한다.
        char[] originalArray = new char[]{'h','e','l','l','o'};
        char[] copiedArray = new char[5];
        System.arraycopy(originalArray,0,copiedArray,0,originalArray.length);

        System.out.println(Arrays.toString(copiedArray));

        // 프로그램 종료
        System.exit(0);
        System.out.println("hello");
    }
}
