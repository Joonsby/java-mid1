package lang.string.test;

public class TestString9 {
    public static void main(String[] args) {
        String email = "hello@example.com";

        String[] parts = email.split("@");
        String idPart = parts[0];
        String emailPart = parts[1];
        System.out.println(idPart);
        System.out.println(emailPart);
    }
}
