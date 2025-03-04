package HW2025.HW10;

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
//
//        Month[] mm = {
//                new Month("January", 31, 23),
//                new Month("February", 28, 20),
//                new Month("March", 31, 21),
//                new Month("April", 30, 22),
//                new Month("May", 31, 22),
//                new Month("June", 30, 21),
//                new Month("July", 31, 23),
//                new Month("August", 31, 21),
//                new Month("September", 30, 22),
//                new Month("October", 31, 23),
//                new Month("November", 30, 20),
//                new Month("December", 31, 23)
//        };

        Employee employee1 = new Employee(1, "Max", 70);
        employee1.age = 20;
        employee1.sex = "male";

        Manager manager1 = new Manager(2);
        manager1.setName("Vika");
        manager1.setAge(40);
        manager1.setSex("female");
        manager1.setSalary(70);
        manager1.setWorkers(2);


        Month[] employee1Month = {monthArray[0], monthArray[1]};
        System.out.println(employee1);
        employee1.getSalary(employee1Month);

        System.out.println("---------------------------");

        Month[] manager1Month = {monthArray[0],monthArray[1]};
        System.out.println(manager1);
        manager1.getSalary(manager1Month);

        System.out.println("---------------------------");

        System.out.println(employee1.convertToManager(20));
        employee1.convertToManager(20).getSalary(employee1Month);
    }
}
