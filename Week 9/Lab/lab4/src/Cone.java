public class Cone implements Shape {

    private double radius, length;

    public Cone(double radius, double length) {
        this.radius = radius;
        this.length = length;
    }

    @Override
    public double findArea() {
        return Math.PI * radius * (radius + length);
    }

}
