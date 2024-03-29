import java.util.Scanner;

public class Q8 {

    public static int[][] addMatrices(int[][] matrix1, int[][] matrix2) {
        int rows = matrix1.length;
        int columns = matrix1[0].length;
        int result[][] = new int[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        return result;
    }

    public static int[][] multiplyMatrices(int[][] matrix1, int[][] matrix2) {
        int rows1 = matrix1.length;
        int columns1 = matrix1[0].length;
        int columns2 = matrix2[0].length;
        int[][] result = new int[rows1][columns2];

        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < columns2; j++) {
                for (int k = 0; k < columns1; k++) {
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        return result;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the number of rows and columns for the matrices:");
        System.out.print("rows : ");
        int rows = scanner.nextInt();
        System.out.print("columns : ");
        int columns = scanner.nextInt();
        int matrix1[][] = new int[rows][columns];
        int matrix2[][] = new int[rows][columns];

        System.out.println("Enter elements of First matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("Matrix 1 ["+i+"] ["+j+"] = ");
                matrix1[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Enter elements of Second matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("Matrix 2 ["+i+"] ["+j+"] = ");
                matrix2[i][j] = scanner.nextInt();
            }
        }


        System.out.println("Matrix 1 - ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(matrix1[i][j]+" ");
            }
            System.err.println();
        }
        System.out.println("Matrix 2 - ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(matrix2[i][j]+" ");
            }
            System.err.println();
        }

        int[][] sum = addMatrices(matrix1, matrix2);
        System.out.println("Result of Sum - ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(sum[i][j]+" ");
            }
            System.err.println();
        }

        int[][] product = multiplyMatrices(matrix1, matrix2);
        System.out.println("Result of Sum - ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(product[i][j]+" ");
            }
            System.err.println();
        }

    }
}
