package models;

import java.util.List;

public class ParkingSpot extends BaseModel{
    private List<VehicleType> supportedVehicleTypes;
    private ParkingSpotStatus parkingSpotStatus;
    private int spotNumber;
    private ParkingFloor parkingFloor;

}
