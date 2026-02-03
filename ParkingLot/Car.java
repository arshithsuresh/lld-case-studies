package ParkingLot;

public class Car extends Vehicle {

    public Car(String numberPlate) {
        this.numberPlate = numberPlate;
        this.size = VehicleSize.MEDIUM;
    }
}
