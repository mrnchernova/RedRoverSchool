package HW2025.HW9;

public class Manager {
    private int id;
    private String name;
    int age;
    String sex;
    double salary;
    int workers;

    public Manager(int id) {
        this.id = id;
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



    @Override
    public String toString() {
        return "Employee: " + "\n" +
                "  name=" + name + "\n" +
                "  age=" + age + "\n" +
                "  sex=" + sex + "\n" +
                "  salary=" + salary + "\n" +
                "  workers=" + workers + "\n";

    }
}
