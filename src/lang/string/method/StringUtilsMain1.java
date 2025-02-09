package lang.string.method;

public class StringUtilsMain1 {
    public static void main(String[] args) {
        int num = 100;
        boolean bool = true;
        Object obj = new Object();
        String str = "Hello, Java!";

        String numString = String.valueOf(num);
        System.out.println(numString);
        String boolString = String.valueOf(bool);
        System.out.println(boolString);
        String objString = String.valueOf(obj);
        System.out.println(objString);

        // 문자 + x -> 문자
        String numString2 = "" + num;
        System.out.println(numString2);

        //toCharArray 메서드
        char[] c = str.toCharArray();
        for (char c1 : c) {
            System.out.print(c1);
        }
        System.out.println();
    }
}
