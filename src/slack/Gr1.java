package slack;
/**
0 * * * * * * * * * *
0 0 * * * * * * * * *
0 0 0 * * * * * * * *
0 0 0 0 * * * * * * *
0 0 0 0 0 * * * * * *
0 0 0 0 0 0 * * * * *
0 0 0 0 0 0 0 * * * *
0 0 0 0 0 0 0 0 * * *
0 0 0 0 0 0 0 0 0 * *
0 0 0 0 0 0 0 0 0 0 *
 */
public class Gr1 {
    public static void main(String[] args) {

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 10; j++) {
                if (i < j) {
                    System.out.print(" *");
                } else {
                    System.out.print(" 0");
                }
            }

            System.out.println();
        }
    }

}
