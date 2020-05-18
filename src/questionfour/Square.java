package questionfour;

/**
 * Class to represent a Square.
 *
 * @author Michael Male michaelmale31@gmail.com
 */
public class Square extends Shape {

    private double side;

    public Square(double side) {
        super("Square");
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    /**
     * Calculates the area of a shape.
     *
     * @return double containing the area of a shape.
     */
    @Override
    public double calculateArea() {
        return Math.pow(side, 2);
    }
}
