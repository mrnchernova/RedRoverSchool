package HW2025.HW10;


public class Manager {
    private final String name;
    private int age;
    private String sex;
    private final double dailySalary;
    private int workers;


    public Manager(String name, double salary) {
        this.name = name;
        this.dailySalary = salary;
    }

    public Manager(String name, int age, String sex, double salary, int workers) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.dailySalary = salary;
        this.workers = workers;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getSex() {
        return sex;
    }

    public double getDailySalary() {
        return dailySalary;
    }

    public int getWorkers() {
        return workers;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setWorkers(int workers) {
        this.workers = workers;
    }

    public double getSalary(Month[] monthArray) {
        double salary = 0;
        for (Month month : monthArray) {
            double extra = month.getWorkingDays() * dailySalary * 0.01 * workers;
            salary += month.getWorkingDays() * dailySalary + extra;
        }
        return salary;
    }


}
