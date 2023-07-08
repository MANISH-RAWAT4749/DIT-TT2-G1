public class MatrixMultiplication {
    public static int[][] multiplyMatrices(int[][] A, int[][] B, int N) {
        int[][] product = new int[N][N];
        
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                for (int k = 0; k < N; k++) {
                    product[i][j] += A[i][k] * B[k][j];
                }
            }
        }
        
        return product;
    }
    
    public static void printMatrix(int[][] matrix, int N) {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        int[][] A = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        
        int[][] B = {
            {9, 8, 7},
            {6, 5, 4},
            {3, 2, 1}
        };
        
        int N = 3;
        int[][] product = multiplyMatrices(A, B, N);
        
        System.out.println("Matrix A:");
        printMatrix(A, N);
        
        System.out.println("Matrix B:");
        printMatrix(B, N);
        
        System.out.println("Product of Matrices:");
        printMatrix(product, N);
    }
}
