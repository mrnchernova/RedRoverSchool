package HW2025.HW9;

public class Employee {

    private final String name;
    private int age;
    private String sex;
    private final double dailySalary;


    public Employee(String name, int age, String sex, double dailySalary) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.dailySalary = dailySalary;
    }

    public Employee(String name, double dailySalary) {
        this.name = name;
        this.dailySalary = dailySalary;
    }

     public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getSex() {
        return sex;
    }

    public double getDailySalary() {
        return dailySalary;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    //    public void getSalary(Month[] monthArray) {
//        for (int i = 0; i < monthArray.length; i++) {
//            double monthSalary = salary;
//            monthSalary = monthSalary * monthArray[i].getWorkingDays();
//            System.out.println(monthArray[i].getTitle() + " = " + monthSalary);
//        }
//    }


    public double getSalary(Month[] monthArray) {
        double salary = 0;
        for (Month month: monthArray) {
            salary +=month.getWorkingDays() * dailySalary;
        }
        return salary;
    }


    public Manager convertToManager(int numberOfSubordinates) {
        Manager manager = new Manager(name, age, sex, dailySalary, numberOfSubordinates);
        return manager;
    }


}
