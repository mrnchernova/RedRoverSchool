package slack;

/*
 * H * H * H * H * H             * * H H * * H H * *
 H * H * H * H * H *             * * H H * * H H * *
 * H * H * H * H * H             H H * * H H * * H H
 H * H * H * H * H *             H H * * H H * * H H
 * H * H * H * H * H             * * H H * * H H * *
 H * H * H * H * H *             * * H H * * H H * *
 * H * H * H * H * H             H H * * H H * * H H
 H * H * H * H * H *             H H * * H H * * H H
 * H * H * H * H * H             * * H H * * H H * *
 H * H * H * H * H *             * * H H * * H H * *
 */
public class Gr2 {
    public static void main(String[] args) {

        /** I */
     /*   for (int i = 0; i < 9; i++) {
            int x = i % 2;
            switch (x) {
                case 0:
                    for (int j = 0; j < 10; j++) {
                        if (j % 2 == 0) {
                            System.out.print("* ");
                        } else {
                            System.out.print("H ");
                        }
                    }
                    System.out.println();
                    break;
                case 1:
                    for (int j = 0; j < 10; j++) {
                        if (j % 2 == 0) {
                            System.out.print("H ");
                        } else {
                            System.out.print("* ");
                        }
                    }
                    System.out.println();
                    break;
                default:
                    System.out.println("?");
            }
        }
*/

        /** II v1 */
        for (int i = 0; i < 5; i++) {
            int x = i % 2;
            switch (x) {
                case 0:
                    for (int j = 0; j < 5; j++) {
                        if (j % 2 == 0) {
                            System.out.print("* * ");
                        } else {
                            System.out.print("H H ");
                        }
                    }
                    System.out.println();
                    break;
                case 1:
                    for (int j = 0; j < 5; j++) {
                        if (j % 2 == 0) {
                            System.out.print("H H ");
                        } else {
                            System.out.print("* * ");
                        }
                    }
                    System.out.println();
                    break;
                default:
                    System.out.println("?");
            }
            switch (x) {
                case 0:
                    for (int j = 0; j < 5; j++) {
                        if (j % 2 == 0) {
                            System.out.print("* * ");
                        } else {
                            System.out.print("H H ");
                        }
                    }
                    System.out.println();
                    break;
                case 1:
                    for (int j = 0; j < 5; j++) {
                        if (j % 2 == 0) {
                            System.out.print("H H ");
                        } else {
                            System.out.print("* * ");
                        }
                    }
                    System.out.println();
                    break;
                default:
                    System.out.println("?");
            }
        }
    }

    /** II v2 */
//        for (int i = 0; i < 5; i++) {
//            int x = i % 2;
//            printGr(x);
//            printGr(x);
//        }
//    }
//
//    private static void printGr(int x) {
//        switch (x) {
//            case 0:
//                for (int j = 0; j < 5; j++) {
//                    if (j % 2 == 0) {
//                        System.out.print("* * ");
//                    } else {
//                        System.out.print("H H ");
//                    }
//                }
//                System.out.println();
//                break;
//            case 1:
//                for (int j = 0; j < 5; j++) {
//                    if (j % 2 == 0) {
//                        System.out.print("H H ");
//                    } else {
//                        System.out.print("* * ");
//                    }
//                }
//                System.out.println();
//                break;
//            default:
//                System.out.println("?");
//        }
//    }
}
