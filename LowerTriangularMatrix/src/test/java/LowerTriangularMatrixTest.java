import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LowerTriangularMatrixTest {
    private static LowerTriangularMatrix lowerTriangularMatrix;

    @BeforeAll
    public static void setup() {
        int[][] squareMatrix = {{1, 0, 0, 0, 0}, {2, 3, 0, 0, 0}, {4, 5, 6, 0, 0}, {7, 8, 9, 10, 0}, {11, 12, 13, 14, 15}};
        lowerTriangularMatrix = new LowerTriangularMatrix(squareMatrix, 5, 5);
    }

    @Test
    public void checkArrayType() {
        assertEquals(true, lowerTriangularMatrix.validateTriangularMatrix());
    }

}
