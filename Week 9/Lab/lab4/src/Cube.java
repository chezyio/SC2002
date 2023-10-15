public class Cube implements Shape{
    private double length;

    public Cube(double length) {
        this.length = length;
    }

    @Override
    public double findArea() {
        Square square = new Square(length);
        return 6 * square.findArea();
    }
}