public class Matrix {
    public static void main(String[] args) {
        // - Create (dynamically) a two dimensional array
//   with the following matrix. Use a loop!
//
//   1 0 0 0
//   0 1 0 0
//   0 0 1 0
//   0 0 0 1
//
// - Print this two dimensional array to the output
        int a = 5;
        int b = a;
        int[][] matrix = new int[a][b];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (i!=j){
                    matrix[i][j] = 0;
                } else {
                    matrix[i][j] = 1;
                }
            }

        }
        printMatrix(matrix);
    }
    public static void printMatrix (int [] [] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length ; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }

}