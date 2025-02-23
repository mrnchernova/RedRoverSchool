package HW2025.HW8.t1;

public class Month {
    String title;
    int days;
    int workingDays;

    @Override
    public String toString() {
        return "Month{" +
                "title='" + title + '\'' +
                ", days=" + days +
                ", workingDays=" + workingDays +
                '}';
    }


    public String prettyOutput() {
        return "Month{" +
                "title='" + title + '\'' +
                ", days=" + days +
                ", workingDays=" + workingDays +
                '}';
    }
}
