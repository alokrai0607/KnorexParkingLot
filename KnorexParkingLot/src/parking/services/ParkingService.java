package parking.services;

import parking.models.ParkingLot;
import parking.models.Vehicle;
import parking.models.VehicleType;

public class ParkingService {
    private ParkingLot parkingLot;

    public ParkingService(ParkingLot parkingLot) {
        this.parkingLot = parkingLot;
    }

    public void addVehicle(Vehicle vehicle) {
        // Add vehicle to the parking lot
    }

    public double checkoutVehicle(String registrationNumber, long endTime) {
        // Remove vehicle from parking lot and calculate parking fee
        return 0; // implementation
    }

    public boolean checkAvailability(int floorNumber, VehicleType type) {
        // Check availability of parking space
        return true; // implementation
    }
}
