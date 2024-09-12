package HW6;

/**
 * Необходимо создать класс Worker где метод getSalary будет возвращать базовую ставку.
 * <p>
 * Необходимо создать класс Manager в который нужно добавить следующие методы:
 * getNumberOfSubordinates - получить количество подчиненных
 * setNumberOfSubordinates
 * <p>
 * в классе, метод getSalary будет возвращать значение по формуле - <базовая ставка> * (<количество подчиненных> / 100 * 3).
 * Если количество подчиненных 0, то результат как у обычного рабочего.
 * <p>
 * Необходимо создать класс Director с теми же методами, что и Manager, но метод
 * getSalary должен возвращать результат по формуле - <базовая ставка> * (<количество подчиненных> / 100 * 9).
 * Если количество подчиненных 0, то результат как у обычного рабочего.
 */
public class Main2 {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.setName("Boris");
        System.out.println(e1.name);
        System.out.println(e1.getBaseSalary());


        Worker w1 = new Worker();
        w1.setName("Viktor");
        System.out.println(w1.getSalary());


        System.out.println("\nMANAGER");
        Manager m1 = new Manager();
        System.out.println(m1.getSalary());

        System.out.println("\nDIRECTOR");
        Director d1 = new Director();
        System.out.println(d1.getSalary());



    }
}

