package geometrypackage;

public class Rhombus implements Shape{
    private double lenght;
    private double high;

    public void setHigh(double high) {
        this.high = high;
    }

    public double getHigh() {
        return high;
    }

    public void setLenght(double lenght) {
        this.lenght = lenght;
    }

    public double getLenght() {
        return lenght;
    }

    public Rhombus(){
    }

    public Rhombus(double lenght, double high){
        this.lenght = lenght;
        this.high = high;
    }
    @Override
    public double getArea() {
        return lenght * high;
    }
}
