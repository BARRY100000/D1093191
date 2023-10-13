import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.example.Triangle;
import org.example.Triangle.TriangleType;
import org.example.TriangleException;

public class TriangleTest {     //測試各種不同的三邊長

    @Test
    public void testEquilateralTriangle() throws TriangleException{
        TriangleType type = Triangle.checkTriangle(3, 3, 3);
        assertEquals(TriangleType.EQUILATERAL, type);
    }

    @Test
    public void testIsoscelesTriangle() throws TriangleException {
        TriangleType type = Triangle.checkTriangle(3, 3, 2);
        assertEquals(TriangleType.ISOSCELES, type);
    }

    @Test
    public void testScaleneTriangle() throws TriangleException {
        TriangleType type = Triangle.checkTriangle(3, 4, 5);
        assertEquals(TriangleType.SCALANE, type);
    }

    @Test
    public void testNotATriangle() {
        assertThrows(TriangleException.class, () -> {
            Triangle.checkTriangle(1, 2, 3);
        });
    }

}
