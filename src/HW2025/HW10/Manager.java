package HW2025.HW10;


public class Manager extends Employee {

    private int workers;

    public Manager(String name, double dailySalary, int workers) {
        super(name, dailySalary);
        this.workers = workers;
    }

    public Manager(String name, int age, String sex, double dailySalary, int workers) {
        super(name, age, sex, dailySalary);
        this.workers = workers;
    }

    public int getWorkers() {
        return workers;
    }

    public void setWorkers(int workers) {
        this.workers = workers;
    }

    public double getSalary(Month[] monthArray) {
        double salary = 0;
        for (Month month : monthArray) {
            double extra = month.getWorkingDays() * getDailySalary() * 0.01 * workers;
            salary += month.getWorkingDays() * getDailySalary() + extra;
        }
        return salary;
    }


}
