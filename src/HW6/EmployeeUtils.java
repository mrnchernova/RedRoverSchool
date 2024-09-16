package HW6;

public class EmployeeUtils {


//     * Необходимо создать утилитарный класс (класс только со статическими полями и методами) со следующими методами:


    //     * поиск сотрудника в массиве по его имени
    public static Employee findByName(Employee[] employees, String byName) {
        for (Employee employee : employees) {
            if (employee.getName().equals(byName)) {
                return employee;
            }
        }
        return null;
    }


    //     * поиск сотрудника в массиве по вхождению указанной строки в его имени
    public static Employee findBySubstring(Employee[] employees, String substring) {
        for (Employee employee : employees) {
            if (employee.getName().contains(substring)) {
                return employee;
            }
        }
        return null;
    }

    //     * подсчет зарплатного бюджета для всех сотрудников в массиве
    public static double getTotalSalary(Employee[] employees) {
        double allSalary = 0;
        for (Employee employee : employees) {
            allSalary += employee.getSalary();
        }
        return allSalary;
    }

    //     * поиск наименьшей зарплаты в массиве
    public static double getMinSalary(Employee[] employees) {
        double minSalary = employees[0].getSalary();
        for (Employee employee : employees) {
            if (employee.getSalary() < minSalary) {
                minSalary = employee.getSalary();
            }
        }

        return minSalary;
    }

//     * поиск наибольшей зарплаты в массиве

    /**
     * -/-/-
     */

//     * поиск наименьшего количества подчиненных в массиве менеджеров
    public static int minSubordinates(Manager[] managers) {
        int minSub = managers[0].getNumberOfSubordinates();
        for (Manager manager : managers) {
            if (manager.getNumberOfSubordinates() < minSub) {
                minSub = manager.getNumberOfSubordinates();
            }
        }
        return minSub;
    }

//     * поиск наибольшего количества подчиненных в массиве менеджеров

    /**
     * -/-/-
     */

//     * поиск наибольшей надбавки (разнице между базовой ставкой и зарплатой) в массиве менеджеров
    public static double getDefinitionSalary(Manager[] managers) {
        double mostDef = 0;
        for (Manager manager : managers) {
            if(Math.abs(manager.getSalary() - manager.getBaseSalary()) > mostDef){
                mostDef = Math.abs(manager.getSalary() - manager.getBaseSalary());
            }
        }
        return mostDef;
    }

//     * поиск наименьшей надбавки (разнице между базовой ставкой и зарплатой) в массиве менеджеров
    /** -/-/- */
}
