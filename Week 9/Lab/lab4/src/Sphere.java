public class Sphere implements Shape{

    private double radius;
    public Sphere(double radius) {
        this.radius = radius;
    }

    @Override
    public double findArea() {
        Circle circle = new Circle(radius);
        return 4 * circle.findArea();
    }
}
