import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UpperTriangularMatrixTest {
    private static UpperTriangularMatrix upperTriangularMatrix;

    @BeforeAll
    public static void setup() {
        int[][] squareMatrix = {{1, 2, 3, 4, 5}, {0, 6, 7, 8, 9}, {0, 0, 1, 2, 4}, {0, 0, 0, 3, 4}, {0, 0, 0, 0, 5}};
        upperTriangularMatrix = new UpperTriangularMatrix(squareMatrix, 5);
    }

    @Test
    public void checkArrayType() {
        assertEquals(true, upperTriangularMatrix.validateTriangularMatrix());
    }

}
