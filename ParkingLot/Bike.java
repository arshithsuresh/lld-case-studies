package LLD.ParkingLot;

public class Bike extends Vehicle {

    public Bike(String numberPlate) {
        this.numberPlate = numberPlate;
        this.size = VehicleSize.SMALL;
    }
}
