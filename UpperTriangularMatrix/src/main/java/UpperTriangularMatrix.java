public class UpperTriangularMatrix {

    private int[][] squareMatrix;
    private int rows;
    private int columns;

    public UpperTriangularMatrix(int[][] squareMatrix, int rows) {
        this.squareMatrix = squareMatrix;
        this.rows = rows;
        this.columns = columns;
    }

    public boolean validateTriangularMatrix() {
        for (int i = 1; i < rows; i++) {
            for (int j = 0; j < i; j++) {
                if (squareMatrix[i][j] != 0)
                    return false;
            }
        }
        return true;
    }
}
