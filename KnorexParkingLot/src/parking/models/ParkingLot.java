package parking.models;

import java.util.List;

// Class representing a parking lot
public class ParkingLot {

	private List<Floor> floors; // list of floors in the parking lot

	// Constructor to initialize parking lot with a list of floors
	// D: Definition - Initializes a parking lot with a list of floors.
	// U: Use case - Used to create a parking lot with specified floors for parking vehicles.
	// B: Benefits - Facilitates the management of multiple floors within a parking lot.
	// E: Example Code - See below.
	// X: This class manages parking spaces and vehicles within a parking lot, providing methods to check space availability, park vehicles, and remove vehicles with calculated fees.
	public ParkingLot(List<Floor> floors) {
		this.floors = floors;
	}

	// Method to check if space is available for a specific vehicle type on a particular floor
	// D: Definition - Checks if space is available for a specific vehicle type on a particular floor.
	// U: Use case - Used to determine if there is space available for parking a vehicle of a certain type on a specific floor.
	// B: Benefits - Helps in managing parking occupancy and informing incoming vehicles about space availability.
	// E: Example Code - See below.
	// X: This method iterates through the parking spaces on the specified floor to check for availability.
	public boolean isSpaceAvailable(int floorNumber, VehicleType type) {
		Floor floor = getFloor(floorNumber);
		if (floor == null) {
			throw new IllegalArgumentException("Invalid floor number: " + floorNumber);
		}
		for (VehicleSpace space : floor.getSpaces()) {
			if (space.getType() == type && space.isAvailable()) {
				return true;
			}
		}
		return false;
	}

	// Method to park a vehicle in the parking lot
	// D: Definition - Parks a vehicle in the parking lot.
	// U: Use case - Used to park a vehicle in an available parking space based on its type.
	// B: Benefits - Efficiently allocates parking spaces for incoming vehicles, optimizing parking lot usage.
	// E: Example Code - See below.
	// X: This method iterates through the floors and parking spaces to find an available space for the vehicle.
	public void parkVehicle(Vehicle vehicle) {
		for (Floor floor : floors) {
			for (VehicleSpace space : floor.getSpaces()) {
				if (space.isAvailable() && space.getType() == vehicle.getType()) {
					return;
				}
			}
		}
		throw new IllegalStateException("No available space for vehicle type: " + vehicle.getType());
	}

	// Method to remove a vehicle from the parking lot and calculate parking fee
	// D: Definition - Removes a vehicle from the parking lot and calculates the parking fee based on the duration.
	// U: Use case - Used to remove a parked vehicle from the parking lot and calculate the fee incurred for parking.
	// B: Benefits - Provides a mechanism to track parking duration and calculate fees accurately.
	// E: Example Code - See below.
	// X: This method calculates the parking duration, retrieves the cost strategy, and sets the parking space as available.
	public double removeVehicle(String registrationNumber, long endTime) {
		double parkingFee = 0;

		for (Floor floor : floors) {
			for (VehicleSpace space : floor.getSpaces()) {
				if (!space.isAvailable() && space.getVehicle().getRegistrationNumber().equals(registrationNumber)) {
					long duration = endTime - space.getVehicle().getEntryTime();

					CostStrategy costStrategy = new CostStrategy();
					parkingFee = costStrategy.calculateCost(duration, space.getType());

					space.setAvailable(true);
					return parkingFee;
				}
			}
		}
		throw new IllegalArgumentException("Vehicle with registration number " + registrationNumber + " not found in parking lot.");
	}

	// Private method to retrieve a floor by its number
	// D: Definition - Retrieves a floor by its number.
	// U: Use case - Used internally to get a specific floor based on its number.
	// B: Benefits - Provides a helper method to access floors within the parking lot.
	// E: Example Code - See below.
	// X: This method helps in locating a specific floor within the parking lot.
	private Floor getFloor(int floorNumber) {
		for (Floor floor : floors) {
			if (floor.getFloorNumber() == floorNumber) {
				return floor;
			}
		}
		return null;
	}
}
