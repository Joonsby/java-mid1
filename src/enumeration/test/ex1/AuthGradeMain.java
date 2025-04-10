package enumeration.test.ex1;

public class AuthGradeMain {
    public static void main(String[] args) {
        for (AuthGrade grade : AuthGrade.values()) {
            System.out.println("grade=" + grade.name() + ", level=" + grade.getLevel() + ", 설명=" + grade.getDescription());
        }
    }
}
