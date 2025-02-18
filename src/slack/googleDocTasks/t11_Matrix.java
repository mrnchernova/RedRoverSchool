package slack.googleDocTasks;



public class t11_Matrix {

    public static void main(String[] args) {
        int[][] matrix = new int[10][10];
        int x = 0;
        for (int i = 0; i < matrix.length; i++) {
            matrix[i][0] = i + 1;
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[0][j] = j + 1;
            }
        }

        for (int i = 1; i < matrix.length; i++) {
            for (int j = 1; j < matrix[i].length; j++) {
                matrix[i][j] = matrix[i][0] * matrix[0][j];
            }
        }
        print(matrix);
    }

    public static void print(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(String.format("%4d",matrix[i][j]));
            }
            System.out.println();
        }
    }


}


