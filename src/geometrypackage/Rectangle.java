package geometrypackage;

public class Rectangle implements Shape {

    public Rectangle() {
        length = 0;
    }

    public Rectangle(double length, double high) {
        this.length = length;
        this.high = high;
    }

    @Override
    public double getArea() {
        return length * high;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getHigh() {
        return high;
    }

    public void setHigh(double high) {
        this.high = high;
    }

    private double length;
    private double high;
}

