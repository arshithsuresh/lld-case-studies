package ParkingLot;

import java.time.Duration;
import java.time.LocalDateTime;

public class ParkingTicket {
    private String id;
    private Vehicle parkedVehicle;

    private LocalDateTime exitTime;
    private LocalDateTime entryTime;

    public String getId() {
        return this.id;
    }

    public Vehicle getVehicle() {
        return this.parkedVehicle;
    }

    public long calculateParkingTime() {
        var duration = Duration.between(exitTime, entryTime);
        return duration.toHours();
    }
}
