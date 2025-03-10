package HW2025.HW10;

public class Director extends Manager{


    public Director(String name, int age, String sex, double salary, int workers) {
        super(name, age, sex, salary, workers);
    }

    @Override
    public double getSalary(Month[] monthArray) {
        double salary = 0;
        for (Month month : monthArray) {
            double extra = month.getWorkingDays() * getDailySalary() * 0.03 * getWorkers();
            salary += month.getWorkingDays() * getDailySalary() + extra;
        }
        return salary;
    }
}
