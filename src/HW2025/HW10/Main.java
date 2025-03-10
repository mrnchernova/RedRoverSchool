package HW2025.HW10;


public class Main {
    public static void main(String[] args) {

        Employee employee = new Employee("Max", 70);
        employee.setAge(20);
        employee.setSex("male");

        Manager manager = new Manager("Vika", 40, "female", 70, 1);
        Director director = new Director("Alex Pavlovich", 60, "male", 70, 1);

        System.out.println("emp: " + employee.getSalary(MonthUtils.ONE));
        System.out.println("man: " + manager.getSalary(MonthUtils.ONE));
        System.out.println("dir: " + director.getSalary(MonthUtils.ONE));

        Manager newManager = employee.convertToManager(2);
        System.out.println(newManager.getSalary(MonthUtils.FULL_YEAR));

        Employee[] e = {employee, manager, director};
        System.out.println("totalSalary: "+ SalaryUtils.getTotalSalary(e,MonthUtils.ONE));
    }
}
