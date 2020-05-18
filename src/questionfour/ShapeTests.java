package questionfour;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ShapeTests {

    @Test
    public void confirmSquareAreaCalculationCorrect() {
        Square square = new Square(5);
        Assertions.assertEquals(25, square.calculateArea());
    }

    @Test
    public void confirmTriangleAreaCalculationCorrect() {
        Triangle triangle = new Triangle(5, 5, 5);
        Assertions.assertEquals(12.5, triangle.calculateArea());
        }

    }


