package HW2024.HW9;

public class Employee extends Person {

    private int salary;

    public Employee(String name, char sex, int age, int salary) {
        super(name, sex, age);
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public boolean isSameName(Employee employee){
        return this.getOnlyName().equals(employee.getOnlyName());
    }
}
