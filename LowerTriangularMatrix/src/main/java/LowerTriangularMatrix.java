public class LowerTriangularMatrix {

    private int[][] squareMatrix;
    private int rows;
    private int columns;

    public LowerTriangularMatrix(int[][] squareMatrix, int rows, int columns) {
        this.squareMatrix = squareMatrix;
        this.rows = rows;
        this.columns = columns;
    }

    public boolean validateTriangularMatrix() {
        for (int i = 0; i < rows; i++) {
            for (int j = i + 1; j < columns; j++) {
                if (squareMatrix[i][j] != 0)
                    return false;
            }
        }
        return true;
    }
}
