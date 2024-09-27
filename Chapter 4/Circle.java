public class Circle {
    // Static variables for radius, diameter, and area
    private static double radius;
    private static double diameter;
    private static double area;

    // Constructor to initialize radius, diameter, and area
    public Circle() {
        radius = 1; // default radius
        diameter = 2 * radius;
        area = Math.PI * radius * radius;
    }

    // Method to set radius and recalculate diameter and area
    public static void setRadius(double rad) {
        radius = rad;
        diameter = 2 * radius;
        area = Math.PI * radius * radius;
    }

    // Static getter methods
    public static double getRadius() {
        return radius;
    }

    public static double getDiameter() {
        return diameter;
    }

    public static double getArea() {
        return area;
    }
}
