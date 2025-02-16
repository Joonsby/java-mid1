package lang.wrapper;

public class AutoBoxingMain2 {
    public static void main(String[] args) {
        int value = 7;
        //Primitive -> wrapper
        Integer boxedValue = value; //오토 박싱(Auto-boxing)

        //wrapper -> Primitive
        int unboxedValue = boxedValue; //오토 언박싱(Auto-unboxing)

        System.out.println(boxedValue);
        System.out.println(unboxedValue);
    }
}
