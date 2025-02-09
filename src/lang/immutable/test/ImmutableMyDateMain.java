package lang.immutable.test;

public class ImmutableMyDateMain {
    public static void main(String[] args) {
        ImmtuableMyDate date1 = new ImmtuableMyDate(2024,1,1);
        ImmtuableMyDate date2 = date1;
        System.out.println("date1 = " + date1);
        System.out.println("date2 = " + date2);

        System.out.println("2025 -> date1");
        date1 = date1.withYear(2025);
        System.out.println("date1 = " + date1);
        System.out.println("date2 = " + date2);
    }
}