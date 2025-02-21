package HW2024.HW7;

/**
 * Необходимо написать 4 метода:
 * сложение 2х чисел
 * вычитание 2х чисел
 * умножение 2х чисел
 * деление 2х чисел
 */

public class HW_7_1 {
    public static void main(String[] args) {
        double a = 5;
        double b = 2;


        sum(a,b);
        minus(a,b);
        mult(a,b);
        divide(a,b);

    }
    public static void sum(double a, double b){
        System.out.println(a+b);
    }

    public static void minus(double a, double b){
        System.out.println(a-b);
    }

    public static void mult(double a, double b){
        System.out.println(a*b);
    }

    public static void divide(double a, double b){
        System.out.println(a/b);
    }



}
