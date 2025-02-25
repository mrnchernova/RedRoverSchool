package HW2025.HW8;

public class Month {
    String title;
    int days;
    int workingDays;

    public Month(String title, int days, int workingDays) {
        this.title = title;
        this.days = days;
        this.workingDays = workingDays;
    }

    @Override
    public String toString() {
        return "Month{" +
                "title='" + title + '\'' +
                ", days=" + days +
                ", workingDays=" + workingDays +
                '}';
    }
}
