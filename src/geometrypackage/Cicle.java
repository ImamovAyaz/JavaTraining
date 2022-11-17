package geometrypackage;

public class Cicle implements Shape {

    public Cicle() {
        raduis = 0;
    }

    public Cicle(double raduis) {
        this.raduis = raduis;
    }

    public double getRaduis() {
        return raduis;
    }

    public void setRaduis(double raduis) {
        this.raduis = raduis;
    }

    @Override
    public double getArea() {
        // return PI * raduis * raduis;
        return PI * (Math.pow(raduis, 2));
    }

    private final double PI = 3.14;

    private double raduis;

}
