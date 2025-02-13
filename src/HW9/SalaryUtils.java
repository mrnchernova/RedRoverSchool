package HW9;

public class SalaryUtils {

    public static  int getSum(Employee[] empArray){
        int sum = 0;
        for (int i=0; i<empArray.length; i++){
            sum+=empArray[i].getSalary();
        }
        return  sum;
    }
}
