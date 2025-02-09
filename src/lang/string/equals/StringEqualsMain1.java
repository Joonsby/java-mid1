package lang.string.equals;

public class StringEqualsMain1 {
    public static void main(String[] args) {
        String str1 = new String("hello"); //x001
        String str2 = new String("hello"); //x002
        System.out.println(str1 == str2); //false
        System.out.println(str1.equals(str2)); //true

        String str3 = "hello"; //x003
        String str4 = "hello"; //x004
        System.out.println(str3 == str4); //true
        System.out.println(str3.equals(str4)); //false
    }
}
