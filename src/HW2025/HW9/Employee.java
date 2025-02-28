package HW2025.HW9;

public class Employee {

    private int id;
    private String name;
    int age;
    String sex;
    double salary;

    public Employee(int id) {
        this.id = id;
    }



    public void getSalary(Month[] monthArray) {
        for (int i = 0; i < monthArray.length; i++) {
            double monthSalary = salary;
            monthSalary = monthSalary * monthArray[i].getWorkingDays();
            System.out.println(monthArray[i].getTitle() + " = " + monthSalary);
        }
    }

    public String getName() {
        if (sex.equals("male")) {
            return "Mr. " + name;
        } else if (sex.equals("female")) {
            return "Mrs. " + name;
        } else {
            return name;
        }
    }

    @Override
    public String toString() {
        return "Employee: " + "\n" +
                "  name=" + name + "\n" +
                "  age=" + age + "\n" +
                "  sex=" + sex + "\n" +
                "  salary=" + salary + "\n";

    }


}
