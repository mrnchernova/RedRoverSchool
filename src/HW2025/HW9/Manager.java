package HW2025.HW9;

public class Manager {
    private int id=0;
    private String name;
    private int age;
    private String sex;
    private double salary;
    private int workers;

    public Manager(int id) {
        this.id = id++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void getSalary(Month[] monthArray) {
        for (int i = 0; i < monthArray.length; i++) {
            double monthSalary = salary;
            monthSalary *= monthArray[i].getWorkingDays();
            double extra = (monthSalary * 1 / 100) * workers;
            monthSalary += extra;
            System.out.println(monthArray[i].getTitle() + " = " + monthSalary);
        }
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getWorkers() {
        return workers;
    }

    public void setWorkers(int workers) {
        this.workers = workers;
    }





    @Override
    public String toString() {
        return "Manager: " + "\n" +
                "  name=" + name + "\n" +
                "  age=" + age + "\n" +
                "  sex=" + sex + "\n" +
                "  salary=" + salary + "\n" +
                "  workers=" + workers + "\n";

    }
}
