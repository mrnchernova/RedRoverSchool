package HW6;

public class Manager extends Employee {
    int NumberOfSubordinates = 9;

    public int getNumberOfSubordinates() {
        return NumberOfSubordinates;
    }

    public void setNumberOfSubordinates(int numberOfSubordinates) {
        NumberOfSubordinates = numberOfSubordinates;
    }

    public double getSalary() {
        double salary = 0;
        if (getNumberOfSubordinates() != 0) {
            salary = getBaseSalary() * (getNumberOfSubordinates() / 100.0 * 3);
        } else {
            Worker worker = new Worker();
            salary = worker.getSalary();
        }

        return salary;
    }
}

