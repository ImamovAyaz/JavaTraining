package geometrypackage;

public class Rhombus implements Shape {
    private double length;
    private double high;

    public Rhombus() {
    }

    public Rhombus(double lenght, double high) {
        this.length = lenght;
        this.high = high;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    public void setHigh(double high) {
        this.high = high;
    }

    public double getHigh() {
        return high;
    }

    @Override
    public double getArea() {
        return length * high;
    }
}
