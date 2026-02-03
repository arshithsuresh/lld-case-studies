package LLD.ParkingLot;

public class Truck extends Vehicle {

    public Truck(String numberPlate) {
        this.numberPlate = numberPlate;
        this.size = VehicleSize.LARGE;
    }
}
