package HW2025.HW8;

public class Main {
    public static void main(String[] args) {

        Employee employee1 = new Employee();
        employee1.name = "Max";
        employee1.age = 20;
        employee1.sex = "male";
        employee1.dailySalary = 1000;

        Manager manager1 = new Manager();
        manager1.name = "MaxManager";
        manager1.age = 40;
        manager1.sex = "male";
        manager1.dailySalary = 1000;
        manager1.workers = 10;


        System.out.println(employee1.getSalary(MonthUtils.FULL_YEAR));
        System.out.println(manager1.getSalary(MonthUtils.FULL_YEAR));
    }
}
