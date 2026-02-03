package ParkingLot;

public abstract class Vehicle {

    protected VehicleSize size;
    protected String numberPlate;

    public VehicleSize getSize() {
        return this.size;
    }

    public String getNumberPlate() {
        return numberPlate;
    }

}