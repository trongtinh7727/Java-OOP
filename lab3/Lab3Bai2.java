public class Lab3Bai2 {

    public static class Matrix {
        // Add 2 matrix
        public static int[][] add(int[][] matrix1, int[][] matrix2) {
            if (matrix1.length != matrix2.length || matrix1[0].length != matrix2[0].length || matrix1.length == 0) {
                return null;
            }

            for (int i = 0; i < matrix1.length; i++) {
                for (int j = 0; j < matrix1[0].length; j++) {
                    matrix1[i][j] += matrix2[i][j];
                }
            }
            return matrix1;
        }

        // Print a Matrix mxn
        public static void print(int[][] matrix) {
            try {
                for (int i = 0; i < matrix.length; i++) {
                    for (int j = 0; j < matrix[0].length; j++) {
                        System.out.printf("%d\t", matrix[i][j]);
                    }
                    System.out.println();
                }
            } catch (Exception e) {
                System.out.println("Can't print this!");
            }

        }

        // Multiply matrix with num
        public static int [][] multiply(int [][] matrix, int n) {
            if (matrix.length == 0) {
                return null;
            }
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[0].length; j++) {
                    matrix[i][j] *= n;
                }
            }
            return matrix;
        }
    }

    public static void main(String[] args) {
        int[][] matrix1 = { { 1, 2, 3, 5 }, { 1, 0, 5, 7} };
        int[][] matrix2 = { { 1, -8, 7, 5 }, { 1, 2, 5, 6 } };

        //Print matrix
        System.out.println("Matrix 1:");
        Matrix.print(matrix1);
        System.out.println("Matrix 2:");
        Matrix.print(matrix2);

        // Add 2 matrix
        System.out.println("Add 2 matrix:");
        int[][] res = Matrix.add(matrix1, matrix2);
        Matrix.print(res);

        // Multiply matrix with a number
        System.out.printf("Multiply matrix with a number:\n");
        res = Matrix.multiply(matrix1, 3);
        Matrix.print(res);
    }
}
