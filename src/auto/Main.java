package auto;

public class Main {
    public static void main(String[] args) {
        DriveEngine myFirstCar = new Car();
        myFirstCar.driveStart();
        myFirstCar.driveStop();

        DriveEngine myFirstBike = new Bike();
        myFirstBike.driveStart();
        myFirstBike.driveStop();


    }
}
