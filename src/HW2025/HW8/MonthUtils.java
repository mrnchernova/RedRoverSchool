package HW2025.HW8;

public class MonthUtils {

//        Month[] monthArray = new Month[12];
//        monthArray[0] = new Month("January", 31, 23);
//        monthArray[1] = new Month("February", 28, 20);
//        monthArray[2] = new Month("March", 31, 21);
//        monthArray[3] = new Month("April", 30, 22);
//        monthArray[4] = new Month("May", 31, 22);
//        monthArray[5] = new Month("June", 30, 21);
//        monthArray[6] = new Month("July", 31, 23);
//        monthArray[7] = new Month("August", 31, 21);
//        monthArray[8] = new Month("September", 30, 22);
//        monthArray[9] = new Month("October", 31, 23);
//        monthArray[10] = new Month("November", 30, 20);
//        monthArray[11] = new Month("December", 31, 23);

    public static final Month JAN = makeMonth("January", 31, 23);
    public static final Month FEB = makeMonth("February", 28, 20);
    public static final Month MAR = makeMonth("March", 31, 21);
    public static final Month APR = makeMonth("April", 30, 22);
    public static final Month MAY = makeMonth("May", 31, 22);
    public static final Month JUN = makeMonth("June", 30, 21);
    public static final Month JUL = makeMonth("July", 31, 23);
    public static final Month AUG = makeMonth("August", 31, 21);
    public static final Month SEP = makeMonth("September", 30, 22);
    public static final Month OCT = makeMonth("October", 31, 23);
    public static final Month NOV = makeMonth("November", 30, 20);
    public static final Month DEC = makeMonth("December", 31, 23);



    public static final Month[] FULL_YEAR = {JAN, FEB, MAR, APR, MAY, JUN, JUL, AUG, SEP, OCT, NOV, DEC};
    public static final Month[] H1 = {JAN, FEB, MAR, APR, MAY, JUN};
    public static final Month[] Q1 = {APR, MAY, JUN};

    private static Month makeMonth(String title, int days, int workingDays) {
        Month month = new Month();
        month.title = title;
        month.days = days;
        month.workingDays = workingDays;
        return month;
    }
}
