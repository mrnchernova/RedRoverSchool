package HW2025.HW8;

public class Main {
    public static void main(String[] args) {

        Month[] monthArray = new Month[12];
        monthArray[0] = new Month("January", 31, 23);
        monthArray[1] = new Month("February", 28, 20);
        monthArray[2] = new Month("March", 31, 21);
        monthArray[3] = new Month("April", 30, 22);
        monthArray[4] = new Month("May", 31, 22);
        monthArray[5] = new Month("June", 30, 21);
        monthArray[6] = new Month("July", 31, 23);
        monthArray[7] = new Month("August", 31, 21);
        monthArray[8] = new Month("September", 30, 22);
        monthArray[9] = new Month("October", 31, 23);
        monthArray[10] = new Month("November", 30, 20);
        monthArray[11] = new Month("December", 31, 23);

        Employee employee1 = new Employee();
        employee1.name = "Max";
        employee1.age = 20;
        employee1.sex = "male";
        employee1.salary = 70;

        Manager manager1 = new Manager();
        manager1.name = "MaxManager";
        manager1.age = 40;
        manager1.sex = "male";
        manager1.salary = 70;
        manager1.workers = 2;


        Month[] employee1Month = {monthArray[0],monthArray[1]};
        employee1.getSalary(employee1Month);

//        Month[] manager1Month = {monthArray[0],monthArray[1]};
//        manager1.getSalary(manager1Month);
    }
}
