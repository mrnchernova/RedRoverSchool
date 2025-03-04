package HW2025.HW10;

public class Month {
    private final String title;
    private final int days;
    private final int workingDays;

    public Month(String title, int days, int workingDays) {
        this.title = title;
        this.days = days;
        this.workingDays = workingDays;
    }

    public String getTitle() {
        return title;
    }

    public int getDays() {
        return days;
    }

    public int getWorkingDays() {
        return workingDays;
    }
}
