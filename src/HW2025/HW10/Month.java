package HW2025.HW10;

public class Month {
    private String title;
    private int days;
    private int workingDays;

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




    @Override
    public String toString() {
        return "Month{" +
                "title='" + title + '\'' +
                ", days=" + days +
                ", workingDays=" + workingDays +
                '}';
    }
}
