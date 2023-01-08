package geometrypackage;

public class Human implements Shape {
    private double length;
    private double weight;

    public Human() {

    }

    public Human(double length, double weight) {
        this.length = length;
        this.weight = weight;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public double getArea() {
        return length * weight;
    }
}
