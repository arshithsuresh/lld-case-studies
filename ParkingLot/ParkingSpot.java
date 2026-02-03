package ParkingLot;

public abstract class ParkingSpot {

    protected Vehicle parkedVehicle;
    protected int spotNumber;
    protected VehicleSize size;

    public ParkingSpot(int spotNumber, VehicleSize size) {
        this.spotNumber = spotNumber;
        this.size = size;
    }

    public boolean isParked() {
        return this.parkedVehicle != null;
    }

    public int getSpotNumber() {
        return this.spotNumber;
    }

    public VehicleSize getSize() {
        return this.size;
    }

    public void parkVehicle(Vehicle vehicle) {
        this.parkedVehicle = vehicle;
    }

    public void vacateSpot() {
        this.parkedVehicle = null;
    }

}
