package questionfour;

/**
 * Class to represent a Triangle. The hypotenuse is not used in area
 * calculation however has been included for the sake of completeness.
 *
 * @author Michael Male michaelmale31@gmail.com
 */
public class Triangle extends Shape {

    private double base;
    private double height;
    private double hypotenuse;

    public Triangle(double base, double height, double hypotenuse) {
        super("Triangle");
        this.base = base;
        this.height = height;
        this.hypotenuse = hypotenuse;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getHypotenuse() {
        return hypotenuse;
    }

    public void setHypotenuse(double hypotenuse) {
        this.hypotenuse = hypotenuse;
    }

    /**
     * Calculates the area of a shape.
     *
     * @return double containing the area of a shape.
     */
    @Override
    public double calculateArea() {
        return (base * height) / 2;
    }
}
