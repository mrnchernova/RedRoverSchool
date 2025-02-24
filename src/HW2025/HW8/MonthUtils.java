package HW2025.HW8;

import java.util.Arrays;

public class MonthUtils {
    public static void main(String[] args) {
//        Month jan = new Month();
//        jan.title = "January";
//        jan.days = 31;
//        jan.workingDays = 18;
//
//        Month feb = new Month();
//        feb.title = "February";
//        feb.days = 28;
//        feb.workingDays = 15;
//
//        Month mar = new Month();
//        mar.title = "March";
//        mar.days = 31;
//        mar.workingDays = 24;
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
    }
}
