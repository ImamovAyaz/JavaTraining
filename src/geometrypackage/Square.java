package geometrypackage;

public class Square implements Shape{

    public Square(){
        lenght = 0;
    }

    public Square(double lenght){
        this.lenght = lenght;
    }

    @Override
    public double getArea() {
        return lenght * lenght;
    }

    public double getLenght() {
        return lenght;
    }

    public void setLenght(double lenght) {
        this.lenght = lenght;
    }

    private double lenght;
}
