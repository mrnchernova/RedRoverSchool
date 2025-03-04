package HW2025.HW10;

public class Employee {

    private int id;
    private String name;
    int age;
    String sex;
    double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
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

    public Manager convertToManager(int numberOfSubordinates) {
        Manager manager = new Manager(id);
        manager.setName(this.name);
        manager.setAge(this.age);
        manager.setSex(this.sex);
        manager.setSalary(this.salary);
        manager.setWorkers(numberOfSubordinates);

        return manager;
    }


}
