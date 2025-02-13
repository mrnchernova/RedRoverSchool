package HW8.h2;

public class Employee {
    String name;
    double salary;
    int children;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getChildren() {
        return children;
    }

    public void setChildren(int children) {
        this.children = children;
    }

    public static Employee findByName(Employee[] employees, String byName) {
        for (Employee employee : employees) {
            if (employee.getName().equals(byName)) {
                return employee;
            }
        }
        return null;
    }
}
