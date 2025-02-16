package lang.wrapper;

public class AutoBoxingMain1 {
    public static void main(String[] args) {
        //Primitive -> wrapper
        int value = 7;
        Integer boxedValue = Integer.valueOf(value);

        //wrapper -> Primitive
        int unboxedValue = boxedValue.intValue();

        System.out.println(boxedValue);
        System.out.println(unboxedValue);
    }
}
