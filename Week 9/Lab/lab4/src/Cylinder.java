public class Cylinder implements Shape{

    private double radius;
    private double height;

    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    @Override
    public double findArea() {
        Circle circle = new Circle(radius);
        return 2 * circle.findArea() + 2 * Math.PI * height * radius;
    }

}
