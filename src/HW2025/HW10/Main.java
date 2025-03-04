package HW2025.HW10;


public class Main {
    public static void main(String[] args) {

        Employee employee1 = new Employee("Max", 10000);
        employee1.setAge(20);
        employee1.setSex("male");

        Manager manager1 = new Manager("Vika", 40, "female", 10000, 10);


        System.out.println(employee1.getSalary(MonthUtils.FULL_YEAR));
        System.out.println(manager1.getSalary(MonthUtils.FULL_YEAR));

        Manager newManager = employee1.convertToManager(2);
        System.out.println(newManager.getSalary(MonthUtils.FULL_YEAR));
    }
}
