package lang.wrapper.test;

public class WrapperTest3 {
    public static void main(String[] args) {
        String str = "100";
        Integer integer1 = Integer.valueOf(str);
        System.out.println("Integer1 = " + integer1);

        int int1 = integer1.intValue();
        System.out.println("intValue = " + int1);

        Integer integer2 = Integer.valueOf(int1);
        System.out.println("Integer2 = " + integer2);

    }
}
