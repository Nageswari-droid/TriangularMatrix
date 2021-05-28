import java.util.Scanner;

public class TriangularMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rows, columns;
        rows = scanner.nextInt();
        columns = scanner.nextInt();

        if (rows == columns) {

            int[][] squareMatrix = new int[rows][columns];

            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++) {
                    squareMatrix[i][j] = scanner.nextInt();
                }
            }

            UpperTriangularMatrix upperTriangularMatrix = new UpperTriangularMatrix(squareMatrix, rows);
            System.out.println(upperTriangularMatrix.validateTriangularMatrix() ? "Yes" : "No");

        } else {
            System.out.println("Invalid input, the number of rows and columns should be equal");
        }
    }
}
