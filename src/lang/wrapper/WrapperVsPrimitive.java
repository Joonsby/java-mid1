package lang.wrapper;

public class WrapperVsPrimitive {
    public static void main(String[] args) {
        int iterations = 1_000_000_000; // 반복 횟수 설정, 10억
        long startTime,endTime;

        // 기본형 long 사용
        long sumPrimitive = 0;
        startTime = System.currentTimeMillis();
        for(int i = 0; i < iterations; i++){
            sumPrimitive += i;
        }
        endTime = System.currentTimeMillis();
        System.out.println(sumPrimitive);
        System.out.println(endTime - startTime + "ms");

        // 래퍼 클래스 Long 사용
        Long sumWrapper = 0L;
        startTime = System.currentTimeMillis();
        for(int i = 0; i < iterations; i++){
            sumWrapper += i;
        }
        endTime = System.currentTimeMillis();
        System.out.println(sumPrimitive);
        System.out.println(endTime - startTime + "ms");
    }
}
