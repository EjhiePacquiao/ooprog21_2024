public class Circle {
    //  variables for radius, diameter, and area
    public static double radius;
    public static double diameter;
    public static double area;

    // Constructor para i initialize and radius, diameter, and area
    public Circle() {
        radius = 1; // default radius
        diameter = 2 * radius;
        area = Math.PI * radius * radius;
    }

    //  set radius and recalculate diameter and area
    public static void setRadius(double rad) {
        radius = rad;
        diameter = 2 * radius;
        area = Math.PI * radius * radius;
    }

    //getter
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
