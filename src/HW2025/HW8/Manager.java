package HW2025.HW8;

public class Manager {
    String name;
    int age;
    String sex;
    double dailySalary;
    int workers;


//    public void getSalary(Month[] monthArray) {
//        for (int i = 0; i < monthArray.length; i++) {
//            double monthSalary = dailySalary;
//            monthSalary *= monthArray[i].workingDays;
//            double extra = (monthSalary * 1 / 100) * workers;
//            monthSalary += extra;
//            System.out.println(monthArray[i].title + " = " + monthSalary);
//        }
//    }


    public double getSalary(Month[] monthArray) {
        double salary = 0;
        for (Month month : monthArray) {
            double extra = month.workingDays * dailySalary * 0.01 * workers;
            salary += month.workingDays * dailySalary + extra;
        }
        return salary;
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
                "  salary=" + dailySalary + "\n" +
                "  workers=" + workers + "\n";

    }
}
