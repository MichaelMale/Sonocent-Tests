package questionfour;

/**
 * An abstract class for shapes.
 * @author Michael Male michaelmale31@gmail.com
 */
public abstract class Shape {
    private String name;

    /**
     * Constructor for objects of class shape.
     */
    public Shape(String name) {
        this.name = name;
    }

    /**
     * Gets the shape's name.
     * @return  String containing the name of the shape.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Sets the shape's name.
     * @param name  String containing the name of the shape.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Calculates the area of a shape.
     * @return  double containing the area of a shape.
     */
    public abstract double calculateArea();
}
