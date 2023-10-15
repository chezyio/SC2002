public class Cuboid implements Shape{

    private double length, breadth, width;
    public Cuboid(double length, double breadth, double width) {
        this.length = length;
        this.breadth = breadth;
        this.width = width;
    }

    @Override
    public double findArea() {
        Rectangle r1 = new Rectangle(length, breadth);
        Rectangle r2 = new Rectangle(width, breadth);
        return 4 * r1.findArea() + 2 * r2.findArea();
    }
}
