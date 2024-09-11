package HW5;

/**
 * 0  1  2  3  4  5  6  7  8  9
 * 0  1  2  3  4  5  6  7  8
 * 0  1  2  3  4  5  6  7
 * 0  1  2  3  4  5  6
 * 0  1  2  3  4  5
 * 0  1  2  3  4
 * 0  1  2  3
 * 0  1  2
 * 0  1
 * 0
 */
public class HW_5_3_1 {
    public static void main(String[] args) {
        int n = 9;
        while (n >= 0) {
            for (int i = 0; i <= n; i++) {
                System.out.print(i + " ");
            }
            n--;
            System.out.println();
        }

        }
    }

