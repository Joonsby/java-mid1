package lang.immutable.test;

public class ImmtuableMyDate {
    private final int YEAR;
    private final int MONTH;
    private final int DAY;

    public ImmtuableMyDate(int year, int month, int day) {
        this.YEAR = year;
        this.MONTH = month;
        this.DAY = day;
    }

    public ImmtuableMyDate withYear(int YEAR) {
        return new ImmtuableMyDate(YEAR,MONTH,DAY);
    }

    public ImmtuableMyDate withMonth(int MONTH) {
        return new ImmtuableMyDate(YEAR,MONTH,DAY);
    }

    public ImmtuableMyDate withDay(int DAY) {
        return new ImmtuableMyDate(YEAR,MONTH,DAY);
    }

    @Override
    public String toString() {
        return YEAR + "-" + MONTH + "-" + DAY;
    }
}
