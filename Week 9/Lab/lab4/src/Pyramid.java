public class Pyramid implements Shape{

    private double base, height;
    public Pyramid(double base, double height) {
        this.base = base;
        this.height = height;
    }
    @Override
    public double findArea() {
        Triangle triangle = new Triangle(base, height);
        return 4 * triangle.findArea() + base * base;
    }
}
