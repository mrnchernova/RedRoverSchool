package HW6;

/**
 * Необходимо создать класс Employee со следующими методами:
 * getBaseSalary - получить базовую ставку
 * setBaseSalary
 * getName - получить имя
 * setName
 * getSalary - получить зарплату
 */


public class Main1 {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.setName("Boris");
        System.out.println(e1.name);
        System.out.println(e1.getBaseSalary());


    }


}
